package com.example.asus.castelosbeja;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CastlesFragment extends ListFragment {


    public CastlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, CastelosData.Castles);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        if (getActivity().findViewById(R.id.fragment_container) != null){
            Toast.makeText(getActivity().getBaseContext(), "Clicked Portrait." + CastelosData.Castles[position],
                    Toast.LENGTH_SHORT).show();

            DetailsFragment newFragment = new DetailsFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);
            // Commit the transaction
            transaction.commit();

        }
        else{
            Toast.makeText(getActivity().getBaseContext(), "Clicked Landscape." + CastelosData.Castles[position],
                    Toast.LENGTH_SHORT).show();

            TextView articleTextView = (TextView) getActivity().findViewById(R.id.details_textview);
            articleTextView.setText(CastelosData.Details[position]);
        }
    }

}

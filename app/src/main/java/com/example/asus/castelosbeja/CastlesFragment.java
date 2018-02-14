package com.example.asus.castelosbeja;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.castelosbeja.model.Castelo;
import com.example.asus.castelosbeja.model.CastelosData;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CastlesFragment extends Fragment {

    private CastelosAdapter adapter;

    public CastlesFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_castles, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getActivity().findViewById(R.id.fragment_container) != null || getActivity().findViewById(R.id.fragment_castles) != null) {
            this.adapter = new CastelosAdapter(getActivity(), CastelosData.getCastelos());
            ListView listViewCastelos = getActivity().findViewById(R.id.castelosListView);
            if(listViewCastelos != null) {
                listViewCastelos.setAdapter(adapter);
                listViewCastelos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Castelo castelo = adapter.getItem(i);

                        if (getActivity().findViewById(R.id.fragment_container) != null) {
                            DetailsFragment newFragment = FragmentCache.getDetailsFragment1();

                            Bundle args = new Bundle();

                            args.putInt(DetailsFragment.ARG_POSITION, i);
                            newFragment.setArguments(args);

                            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                            // Replace whatever is in the fragment_container view with this fragment,
                            // and add the transaction to the back stack so the user can navigate back
                            transaction.replace(R.id.fragment_container, newFragment);
                            transaction.addToBackStack(null);

                            // Commit the transaction
                            transaction.commit();
                        } else {
                            DetailsFragment detailsFrag = (DetailsFragment)
                                    getActivity().getSupportFragmentManager().findFragmentById(R.id.fragment_details);
                            detailsFrag.updateDetailsView(i);
                        }
                    }
                });
            }
        }
    }
}
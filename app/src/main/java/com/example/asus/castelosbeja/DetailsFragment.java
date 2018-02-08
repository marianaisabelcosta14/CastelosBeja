package com.example.asus.castelosbeja;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.castelosbeja.model.Castelo;
import com.example.asus.castelosbeja.model.CastelosData;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    private ImageView contact = null;
    private ImageView gps = null;
    private ImageView imageCastelo = null;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override public void onStart() {
        super.onStart();
        // During startup, check if there are arguments passed to the fragment.
        // onStart is a good place to do this because the layout has already been
        // applied to the fragment at this point so we can safely call the method
        // below that sets the article text.
        Bundle args = getArguments();
        if (args != null) {
            // Set article based on argument passed in
            int currentPosition = args.getInt("position");

            TextView detailsTextView = (TextView) getActivity().findViewById(R.id.details_textview);
            final Castelo castelo = CastelosData.getCastelos().get(currentPosition);
            detailsTextView.setText(castelo.getDetails());

            TextView nameCasteloTextView = (TextView) getActivity().findViewById(R.id.textViewName);
            nameCasteloTextView.setText(castelo.getName());

            contact = (ImageView) getActivity().findViewById(R.id.imageViewContact);
        }
    }

}

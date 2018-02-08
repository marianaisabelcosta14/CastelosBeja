package com.example.asus.castelosbeja;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.asus.castelosbeja.model.Castelo;
import com.example.asus.castelosbeja.model.CastelosData;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    private ImageView contact;
    private ImageView gps;
    private ImageView imageCastelo;


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

    }

    public void updateDetailsView(int i) {

        final Castelo castelo = CastelosData.getCastelos().get(i);

        TextView detailsTextView = (TextView) getActivity().findViewById(R.id.details_textview);
        detailsTextView.setText(castelo.getDetails());

        TextView nameCasteloTextView = (TextView) getActivity().findViewById(R.id.textViewName);
        nameCasteloTextView.setText(castelo.getName());

        imageCastelo = (ImageView) getActivity().findViewById(R.id.imageViewCastelo);
        Glide.with(getActivity()).load(castelo.getImage()).into(imageCastelo);

        contact = (ImageView) getActivity().findViewById(R.id.imageViewContact);
    }
}

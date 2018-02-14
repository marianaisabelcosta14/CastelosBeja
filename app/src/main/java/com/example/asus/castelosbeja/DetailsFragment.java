package com.example.asus.castelosbeja;


import android.content.Intent;
import android.net.Uri;
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

    public static final String ARG_POSITION = "position";
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

        Bundle args = getArguments();
        if (args != null){
            updateDetailsView(args.getInt(this.ARG_POSITION, 0));
        }

    }

    public void updateDetailsView(int i) {
        if (getActivity().findViewById(R.id.fragment_container) != null) {
            final Castelo castelo = CastelosData.getCastelos().get(i);

            TextView detailsTextView = (TextView) getActivity().findViewById(R.id.details_textview);
            detailsTextView.setText(castelo.getDetails());

            TextView nameCasteloTextView = (TextView) getActivity().findViewById(R.id.textViewName);
            nameCasteloTextView.setText(castelo.getName());

            imageCastelo = (ImageView) getActivity().findViewById(R.id.imageViewCastelo);
            Glide.with(getActivity()).load(castelo.getImage()).into(imageCastelo);

            contact = (ImageView) getActivity().findViewById(R.id.imageViewContact);
            contact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    castelo.getContact();
                    Uri contactmovel = Uri.parse("tel:" + castelo.getContact());
                    Intent contactmovelIntent = new Intent(Intent.ACTION_DIAL, contactmovel);
                    startActivity(contactmovelIntent);
                }
            });

            gps = (ImageView) getActivity().findViewById(R.id.imageViewGps);
            gps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + castelo.getLocation()+ "("+castelo.getName()+")");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);

                }
            });


        }
    }
}

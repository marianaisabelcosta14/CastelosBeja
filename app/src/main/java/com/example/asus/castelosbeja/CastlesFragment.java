package com.example.asus.castelosbeja;


import android.os.AsyncTask;
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
        this.adapter = new CastelosAdapter(getActivity(), CastelosData.getCastelos());
        ListView listViewCastelos = getActivity().findViewById(R.id.castelosListView);
        listViewCastelos.setAdapter(adapter);
    }
}
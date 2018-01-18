package com.nextsofts.fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {
    TextView txtfragmentoA;

    public FragmentA() {
        /*No se puede referenciar a los objetos View de la vista del fracmento esto es devido a que el unico que puede es
        la actividad contenedora de los fragmentos
        txtfragmentoA=(TextView)findViewId();*/
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

}

package com.nextsofts.fragmentos;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtFragmentoA;
    TextView txtFragmentoB;
    Button add_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*esto son referencia  a los onjetosView del diseño de interface del fragment_a y fragment_b*/
        txtFragmentoA= (TextView) findViewById(R.id.txtfragmentoA);
        txtFragmentoB=(TextView) findViewById(R.id.txtfragmentoB);
        add_fragment=(Button) findViewById(R.id.add_fragment);


        /*como asignar un fragmento en tiempo de ejecucion por la accion de un boton se generara un gragmento*/

        add_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Paso 1: Obtener la instancia del administrador de fragmentos
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

                //Paso 2: Crear una nueva transacción
                android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

                //Paso 3: Crear un nuevo fragmento y añadirlo
                FragmentC fragment = new FragmentC();
                transaction.add(R.id.contenedor, fragment);

                //Paso 4: Confirmar el cambio
                transaction.commit();


            }
        });
    }
    /*para salir de unno de los fracmentos a la IU principal*/
    public void atras(View v){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}

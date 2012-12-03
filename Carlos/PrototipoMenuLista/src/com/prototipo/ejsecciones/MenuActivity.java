package com.prototipo.ejsecciones;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MenuActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        /*
        final String[] datos = new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
        														  android.R.layout.simple_list_item_1, 
        														  datos);
        ListView lstOpciones = (ListView)findViewById(R.id.LstOpciones);
        lstOpciones.setAdapter(adaptador);
   */
        
		AdaptadorTitulares adaptador = new AdaptadorTitulares(this);
		ListView lstOpciones = (ListView)findViewById(R.id.LstOpciones);
		lstOpciones.setAdapter(adaptador);
		
        lstOpciones.setOnItemClickListener(new OnItemClickListener() {
        			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
        			//Acciones necesarias al hacer click
        				switch(position){
        					case 0: Intent intent = new Intent(MenuActivity.this, Seccion1.class);
        							startActivity(intent);
        							break;
        					case 1: Intent intent2 = new Intent(MenuActivity.this, Seccion2.class);
									startActivity(intent2);
									break;
        				}
        					
        			}
        			});
    	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
}

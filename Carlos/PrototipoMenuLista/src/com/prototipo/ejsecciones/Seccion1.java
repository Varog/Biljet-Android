package com.prototipo.ejsecciones;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Seccion1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion1);
        
        final Button btnVolver = (Button)findViewById(R.id.volverButton);
        btnVolver.setOnClickListener(new OnClickListener() {
        								public void onClick(View arg0) {
        									Intent intent = new Intent(Seccion1.this, MenuActivity.class);
        									startActivity(intent);
        								}
        							});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_seccion1, menu);
        return true;
    }
}

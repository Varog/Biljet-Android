package com.prototipo.ejsecciones;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorTitulares extends ArrayAdapter<Titular> {
	Activity context;
	private static Titular[] datos =
			new Titular[]{
			new Titular(android.R.drawable.ic_menu_search,"Sección 1", "Descripción de la sección 1"),
			new Titular(android.R.drawable.ic_menu_add,"Sección 2", "Descripción de la sección 2"),
			new Titular(android.R.drawable.ic_menu_day,"Sección 3", "Descripción de la sección 3"),
			new Titular(android.R.drawable.ic_menu_set_as,"Sección 4", "Descripción de la sección 4"),
			new Titular(android.R.drawable.ic_menu_crop,"Sección 5", "Descripción de la sección 5")};
	

	AdaptadorTitulares(Activity context) {
		super(context, R.layout.listitem_titular, datos);
		this.context = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
		
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.listitem_titular, null);
		
		ImageView icono = (ImageView)item.findViewById(R.id.menuIcono);
		icono.setImageResource(datos[position].getIcono());
		
		TextView lblTitulo = (TextView)item.findViewById(R.id.menuTitulo);
		lblTitulo.setText(datos[position].getTitulo());
		
		TextView lblSubtitulo = (TextView)item.findViewById(R.id.menuSubTitulo);
		lblSubtitulo.setText(datos[position].getSubtitulo());
		
		return item;

	}
}

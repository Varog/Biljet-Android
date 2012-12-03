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
			new Titular(android.R.drawable.ic_menu_search,"Secci�n 1", "Descripci�n de la secci�n 1"),
			new Titular(android.R.drawable.ic_menu_add,"Secci�n 2", "Descripci�n de la secci�n 2"),
			new Titular(android.R.drawable.ic_menu_day,"Secci�n 3", "Descripci�n de la secci�n 3"),
			new Titular(android.R.drawable.ic_menu_set_as,"Secci�n 4", "Descripci�n de la secci�n 4"),
			new Titular(android.R.drawable.ic_menu_crop,"Secci�n 5", "Descripci�n de la secci�n 5")};
	

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

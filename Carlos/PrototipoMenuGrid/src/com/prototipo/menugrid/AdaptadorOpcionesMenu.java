package com.prototipo.menugrid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdaptadorOpcionesMenu extends ArrayAdapter<OpcionMenu> {
		Activity context;
		private static OpcionMenu[] opciones =
				new OpcionMenu[]{
				new OpcionMenu("Secci�n 1",android.R.drawable.ic_menu_search),
				new OpcionMenu("Secci�n 2",android.R.drawable.ic_menu_add),
				new OpcionMenu("Secci�n 3",android.R.drawable.ic_menu_day),
				new OpcionMenu("Secci�n 4",android.R.drawable.ic_menu_set_as),
				new OpcionMenu("Secci�n 5",android.R.drawable.ic_menu_crop)};
		

		AdaptadorOpcionesMenu(Activity context) {
			super(context, R.layout.menuitem, opciones);
			this.context = context;
		}
		
		public View getView(int position, View convertView, ViewGroup parent){
			
			LayoutInflater inflater = context.getLayoutInflater();
			View item = inflater.inflate(R.layout.menuitem, null);
			
			ImageView icono = (ImageView)item.findViewById(R.id.menuImagen_icono);
			icono.setImageResource(opciones[position].getIcono());
			icono.setScaleType(ImageView.ScaleType.CENTER);
			
			TextView titulo = (TextView)item.findViewById(R.id.menuTitulo_opcion);
			titulo.setText(opciones[position].getTitulo());
			
			return item;

		}
	}


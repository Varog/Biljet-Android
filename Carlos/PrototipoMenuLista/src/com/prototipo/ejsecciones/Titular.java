package com.prototipo.ejsecciones;

public class Titular {
	private String titulo;
	private String subtitulo;
	private int icono;
	
	public Titular(int ico, String tit, String sub){
		titulo = tit;
		subtitulo = sub;
		icono = ico;
	}
	
	public int getIcono(){
		return icono;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public String getSubtitulo(){
		return subtitulo;
	}
}
	



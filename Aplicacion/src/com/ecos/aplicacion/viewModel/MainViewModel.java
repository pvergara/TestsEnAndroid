package com.ecos.aplicacion.viewModel;

import java.util.Locale;

import com.ecos.aplicacion.model.EstadoPartida;
import com.ecos.mvvm.NotificationHandler;

public class MainViewModel {

	private String mPalabraDelJuego;
	private NotificationHandler mNotificationHandler;
	private int mContadorFallos;
	private String mPalabraOculta;

	public void iniciarJuegoConLaPalabra(String palabraDelJuego) {
		mPalabraDelJuego = palabraDelJuego;
		mContadorFallos = 0;
		mPalabraOculta = generarPalabraOcultaDesde(palabraDelJuego,' ');
	}
	
	private String generarPalabraOcultaDesde(String palabraDelJuego, char letraUsada) {
		String resultado = "";
		for(char letra:mPalabraDelJuego.toCharArray()){
			if(letra == letraUsada)
				resultado += letra +" ";
			else
				resultado += "_" +" ";
		}
		return resultado.substring(0, resultado.length()-1);
			
	}

	public boolean jugarCon(char letra) {
		if (mPalabraDelJuego.toLowerCase(new Locale("es","ES")).indexOf(Character.toLowerCase(letra))!=-1)
		{
			mNotificationHandler.notify("estadoPartidaChanged", EstadoPartida.crearDesde(mContadorFallos, letra));
			mPalabraOculta = generarPalabraOcultaDesde(mPalabraDelJuego,letra);
			return true;
		}
		else
		{
			mContadorFallos++;
			mNotificationHandler.notify("estadoPartidaChanged", EstadoPartida.crearDesde(mContadorFallos, letra));
			return false;
		}
	}

	public void setNotificationHandler(NotificationHandler notificationHandler) {
		this.mNotificationHandler = notificationHandler;
	}

	public String getPalabraOculta() {
		return mPalabraOculta;
	}

}

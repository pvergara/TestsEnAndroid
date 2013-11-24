package com.ecos.aplicacion.viewModel;

public class MainViewModel {

	private String mPalabraDelJuego;

	public boolean jugarCon(String letra) {
		if (mPalabraDelJuego.contains(letra))
			return true;
		else
			return false;
	}

	public void iniciarJuegoConLaPalabra(String palabraDelJuego) {
		mPalabraDelJuego = palabraDelJuego;
	}

}

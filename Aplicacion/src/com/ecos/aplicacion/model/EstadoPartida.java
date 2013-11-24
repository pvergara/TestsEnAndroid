package com.ecos.aplicacion.model;

public class EstadoPartida {

	private int mContadorDeFallos;
	private char mLetraUsada;

	private EstadoPartida(int contadorDeFallos, char letraUsada) {
		mContadorDeFallos = contadorDeFallos;
		mLetraUsada = letraUsada;
	}

	public static EstadoPartida crearDesde(int contadorDeFallos, char letraUsada) {
		return new EstadoPartida(contadorDeFallos, letraUsada);
	}


	@Override
	public String toString() {
		return String.format("EstadoPartida [mContadorDeFallos=%s, mLetraUsada=%s]",mContadorDeFallos, mLetraUsada);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mContadorDeFallos;
		result = prime * result + mLetraUsada;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EstadoPartida)) {
			return false;
		}
		EstadoPartida other = (EstadoPartida) obj;
		if (mContadorDeFallos != other.mContadorDeFallos) {
			return false;
		}
		if (mLetraUsada != other.mLetraUsada) {
			return false;
		}
		return true;
	}



}

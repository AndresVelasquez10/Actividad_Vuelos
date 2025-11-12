package dto;

import java.io.Serializable;

public class Asiento implements Serializable{

	private int fila;
	private char asiento;
	private Pasajero pasajero;

	public Asiento(int fila, char asiento) {
		this.fila = fila;
		this.asiento = asiento;
		this.pasajero = null;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getAsiento() {
		return asiento;
	}

	public void setAsiento(char asiento) {
		this.asiento = asiento;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
}

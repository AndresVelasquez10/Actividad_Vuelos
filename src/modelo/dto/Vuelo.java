package dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Vuelo implements Serializable{
protected int numero;
protected String origen;
protected String destino;
protected LocalDate fechaSalida;
protected float HoraSalida;
protected String areolinea;
protected Asiento[][] asiento;
    private static final int MAX_FILAS = 30;

    /**
     * Crea un nuevo vuelo y genera sus asientos automaticamente.
     * @param filas cantidad de filas (debe ser > 0).
     * @param asientosPorFila cantidad de asientos por fila (debe ser entre 1 y 26).
     */
    public Vuelo(int filas, int asientosPorFila) {
        if (filas <= 0 || filas > MAX_FILAS) {
            System.out.println("Asientos por fila debe estar entre 1 y 30");
        }
        if (asientosPorFila <= 0 || asientosPorFila > 26) {
            System.out.println("Asientos por fila debe estar entre 1 y 26");
        }
        this.asiento = new Asiento[filas][asientosPorFila];
        generarAsientos(filas, asientosPorFila);
    }

    /** METODO generar Asientos
     * Genera asientos en orden 1A, 1B, ... nE.
     */
    private void generarAsientos(int filas, int asientosPorFila) {
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < asientosPorFila; col++) {
                char letra = (char) ('A' + col);
                asiento[fila][col] = new Asiento(fila + 1, letra);
            }
        }
    }

    public Asiento[][] getAsientos() {
        return asiento;
    }



}


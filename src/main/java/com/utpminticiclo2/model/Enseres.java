package com.utpminticiclo2.model;

public class Enseres {

    //Constantes
    protected final static double PRECIO_BASE = 200;
    protected final static String COLOR_BASE = "negro";
    protected final static int TAMANO_BASE = 1;

    //Atributos
    protected double precioBase;
    protected String color;
    protected int tamano;

    public Enseres() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR_BASE;
        this.tamano = TAMANO_BASE;
    }

    public Enseres(Double precioBase, int tamano) {
        this.precioBase = precioBase;
        this.tamano = tamano;
    }

    public Enseres(Double precioBase, Integer tamano, String color) {
        this.precioBase = precioBase;
        comprobarTamano(tamano);
        comprobarColor(color);
    }

    private void comprobarColor(String color) {
        // Colores disponibles
        String base[] = { "negro", "cafe", "blanco", "rojo" };
        boolean col = false;
        for (int i = 0; i < base.length && !col; i++) {
            if (base[i].equals(color)) {
                col = true;
            }
        }
        if (col) {
            this.color = color;
        } else {
            this.color = COLOR_BASE;
        }
    }

    public void comprobarTamano(int tamano) {
        if (tamano >= 0 && tamano <= 5) {
            this.tamano = tamano;
        } else {
            this.tamano = TAMANO_BASE;
        }
    }

    // Métodos publicos
    /** Devuelve el precio base del enser */
    public double getPrecioBase() {
        return precioBase;
    }

    /** Devuelve el color del enser */
    public String getColor() {
        return color;
    }

    /** Devuelve el tamaño del enser */
    public double getTamano() {
        return tamano;
    }

    /** Precio final del enser */
    public double precioFinal() {
        double demas = 0;
        if (color.equals("negro")) {
            demas += 100;
        } else if (color.equals("cafe")) {
            demas += 80;
        } else if (color.equals("blanco")) {
            demas += 70;
        } else if (color.equals("rojo")) {
            demas += 50;
        }

        if (tamano > 0 && tamano < 1) {
            demas += 200;
        } else if (tamano > 1 && tamano < 2) {
            demas += 300;
        } else if (tamano > 2 && tamano < 3) {
            demas += 400;
        } else if (tamano > 3 && tamano < 4) {
            demas += 500;
        } else if (tamano > 4 && tamano < 5) {
            demas += 600;
        } else if (tamano > 5 && tamano < 6) {
            demas += 700;
        }
        return precioBase + demas;
    }
}

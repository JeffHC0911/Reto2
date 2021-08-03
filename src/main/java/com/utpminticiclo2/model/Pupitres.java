package com.utpminticiclo2.model;

public class Pupitres extends Enseres {
    private final static int COMPARTIMIENTO_BASE = 2;
    private int compartimiento;
    private boolean mesaTipoUniversitaria;

    public Pupitres() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR_BASE;
        this.tamano = TAMANO_BASE;
        this.compartimiento = COMPARTIMIENTO_BASE;
    }
    // Métodos publicos

    public Pupitres(Double precioBase, Integer tamano) {
        this.precioBase = precioBase;
        this.tamano = tamano;
    }

    public Pupitres(double precioBase, int tamano, String color, int Compartimiento, boolean mesaTipoUniversitaria) {
        super(precioBase, tamano, color);
        this.compartimiento = Compartimiento;
        this.mesaTipoUniversitaria = mesaTipoUniversitaria;

    }

    public double precioFinal() {
        double m = super.precioFinal();
        if (mesaTipoUniversitaria) {
            m += 100;
        }

        if (compartimiento > 3) {
            m += 50;
        }
        return m;
    }
}
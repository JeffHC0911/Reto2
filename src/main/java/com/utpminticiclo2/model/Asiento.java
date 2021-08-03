package com.utpminticiclo2.model;

public class Asiento extends Enseres{

    private final static int PESO_BASE=30;
    private int peso;

    public Asiento()
    {
        this.peso=PESO_BASE; 
        this.precioBase=PRECIO_BASE;
        this.color=COLOR_BASE;
        this.tamano=TAMANO_BASE;  
    }
    public Asiento (Double precioBase, Integer tamano)
    {
        this.precioBase=precioBase;
        this.tamano=tamano;
    }
    public Asiento(Double precioBase, Integer tamano, String color,Integer peso)
    {
        super(precioBase, tamano, color);
        this.peso=peso;
        
    }
    public int getPeso()
    {
        return peso;
    }
    /** Precio final de la silla */
    public double precioFinal()
    {
        double z=super.precioFinal();
        if (peso>65)
        {
            z=50;
        }
        return z;
    }
}

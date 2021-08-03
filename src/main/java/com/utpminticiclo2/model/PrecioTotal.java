package com.utpminticiclo2.model;

public class PrecioTotal extends Enseres {
    private Double sumaEnseres;
    private Double sumaAsientos;
    private Double sumaPupitres;
    private Enseres listaEnseres[];

    public PrecioTotal(Enseres penseres[]) {
        this.sumaEnseres = 0.0;
        this.sumaAsientos = 0.0;
        this.sumaPupitres = 0.0;
        this.listaEnseres = penseres;
    }

    public void mostrarTotales() {
        for (int i = 0; i < listaEnseres.length; i++) {
            if (listaEnseres[i] instanceof Enseres) {
                sumaEnseres += listaEnseres[i].precioFinal();
            }
            if (listaEnseres[i] instanceof Asiento) {
                sumaAsientos += listaEnseres[i].precioFinal();
            }
            if (listaEnseres[i] instanceof Pupitres) {
                sumaPupitres += listaEnseres[i].precioFinal();
            }
        }
        System.out.println("La suma del precio de los Enseres es de " + sumaEnseres);
        System.out.println("La suma del precio de los Asientos es de " + sumaAsientos);
        System.out.println("La suma del precio de los Pupitres es de " + sumaPupitres);
    }

}

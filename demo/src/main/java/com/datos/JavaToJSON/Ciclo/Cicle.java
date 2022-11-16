package com.datos.JavaToJSON.Ciclo;

import java.util.ArrayList;

public class Cicle {
    private String tipus;
    private String codi;
    private String sigles;
    private String nom;
    private ArrayList<Cursos> cursos;

    public Cicle(String tipus, String codi, String sigles, String nom, ArrayList<Cursos> cursos) {
        this.tipus = tipus;
        this.codi = codi;
        this.sigles = sigles;
        this.nom = nom;
        this.cursos = cursos;
    }

    public static void main(String[] args) {
        Moduls sistemasInformaticos = new Moduls("0483", "Sistemas informaticos", 170);
        Moduls bbdd = new Moduls("0484", "Base de datos", 170);
        Moduls programacio = new Moduls("0485", "Programación", 230);
        ArrayList<Moduls> modulos1 = new ArrayList<>();
        modulos1.add(sistemasInformaticos);
        modulos1.add(bbdd);
        modulos1.add(programacio);
        // Segundo año
        Cursos segundo = new Cursos(1, modulos1);

        Moduls accDatos = new Moduls("0486", "Acceso a datos", 125);
        ArrayList<Moduls> modulos2 = new ArrayList<>();
        modulos2.add(accDatos);

        Cursos primero = new Cursos(2, modulos2);
        ArrayList<Cursos> cursos = new ArrayList<>();
        cursos.add(primero);
        cursos.add(segundo);
        Cicle cicloLis = new Cicle("CFGS", "IFC32", "DAM", "Desenvolupament aplicacions multiplataforma", cursos);

    }

}

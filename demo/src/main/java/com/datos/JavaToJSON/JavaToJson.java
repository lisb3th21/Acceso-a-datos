package com.datos.JavaToJSON;
import java.util.ArrayList;
import org.json.JSONObject;
import com.datos.JavaToJSON.Ciclo.*;
import com.google.gson.Gson;    


public class JavaToJson {
    public static Cicle getCicle(){
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
        return cicloLis;
    }

    public static void main(String[] args) {

        String stringFicheroJSON = new String(new Gson().toJson(getCicle()));
		// Creo el objeto JSON
		JSONObject jsonObj = new JSONObject(stringFicheroJSON);
        System.out.println(jsonObj.toString(4));
    }
}

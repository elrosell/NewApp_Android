package com.example.newapp;

import java.util.ArrayList;

public class Arreglito {
    ArrayList<Clasesita> allamaditas = new ArrayList<>();
    public void agregar(Clasesita objetito){
        allamaditas.add(objetito);
    }

    public ArrayList<Clasesita> regresar() {
        return allamaditas;
    }
}


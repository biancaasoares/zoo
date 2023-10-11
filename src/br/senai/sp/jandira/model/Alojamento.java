package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Alojamento {


    List<Felino> alojamentoFelino = new ArrayList<>();

    public void adicionarFelinoAlojamento (Felino felino){
        alojamentoFelino.add(felino);
    }


    List<Mamifero> alojamentoMamifero = new ArrayList<>();

    public void adicionarMamiferoAlojamento (Mamifero mamifero){
        alojamentoMamifero.add(mamifero);
    }


    List<Ave> alojamentoAve = new ArrayList<>();

    public void adicionarAveAlojamento(Ave ave){
        alojamentoAve.add(ave);
    }
}

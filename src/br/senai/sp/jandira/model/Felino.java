package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Felino extends Animal{

        List<Felino> listFelino= new ArrayList<>();

    public void listarFelino(){
        for (Felino felino : listFelino){
            System.out.println("id: " + felino.idAnimal);
            System.out.println("nome " + felino.nome);
            System.out.println("idade " + felino.idade);
            System.out.println("---------------------");
        }
    }

    public Felino(){
        super ("felino");
    }

    public void adicionarFelino(Felino felino){
        listFelino.add(felino);

    }
}


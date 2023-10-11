package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{

    List<Mamifero> listMamifero = new ArrayList<>();

    public void listarMamifero(){
        for (Mamifero mamifero : listMamifero){
            System.out.println("id: " + mamifero.idAnimal);
            System.out.println("nome " + mamifero.nome);
            System.out.println("idade " + mamifero.idade);
            System.out.println("---------------------");
        }
    }

    public Mamifero(){
        super ("mamifero");
    }

    public void adicionarMamifero(Mamifero mamifero){
        listMamifero.add(mamifero);

    }
}


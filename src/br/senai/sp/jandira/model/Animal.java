package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animal {

    String nome, especie, sexo;
    int idade, idAnimal;

    Scanner scanner = new Scanner(System.in);

    public Animal (String especie){
        this.especie = especie;
    }

    public void cadastrarAnimal(){
        System.out.println("------- cadastro do animal ---------");
        System.out.println(" Informe o nome do animal ");
        nome = scanner.nextLine();
        System.out.println(" Informe o ID do animal ");
        idAnimal = scanner.nextInt();
        System.out.println(" Informe a idade do animal ");
        idade = scanner.nextInt();
        System.out.println(" Informe o sexo do animal ");
        sexo = scanner.nextLine();
        System.out.println("---------------------------------------");

    }
}

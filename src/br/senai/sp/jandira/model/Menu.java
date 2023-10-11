package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Ave refAve = new Ave();
    Mamifero refMamifero = new Mamifero();
    Felino refFelino = new Felino();

    Alojamento alojamento = new Alojamento();

    public void executarMenu() {

        boolean continuar = true;
        while (continuar) {

            System.out.println("--------------- Menu ---------------- ");
            System.out.println(" 1 - Cadastrar animal                 ");
            System.out.println(" 2 - Listar Animais                   ");
            System.out.println(" 3 - Cadastrar informações de Saúde   ");
            System.out.println(" 4 - Pesquisar animais                ");
            System.out.println(" 5 - Sair                             ");
            System.out.println("------------------------------------  ");

            System.out.println("Escolha uma opção: ");
            int optionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (optionMenu) {
                case 1:
                    System.out.println(" 1- Mamífero");
                    System.out.println(" 2- Ave");
                    System.out.println(" 3- Felino");
                    System.out.println("Escolha qual deseja cadastrar");

                    int optionCadastro = scanner.nextInt();
                    scanner.nextInt();

                    switch (optionCadastro) {
                        case 1:
                            Mamifero mamifero = new Mamifero();
                            mamifero.cadastrarAnimal();
                            refMamifero.adicionarMamifero(mamifero);
                            alojamento.adicionarMamiferoAlojamento(mamifero);
                            break;
                        case 2:
                            Ave ave = new Ave();
                            ave.cadastrarAnimal();
                            refAve.adicionarAve(ave);
                            alojamento.adicionarAveAlojamento(ave);
                            break;
                        case 3:
                            Felino felino = new Felino();
                            felino.cadastrarAnimal();
                            refFelino.adicionarFelino(felino);
                            alojamento.adicionarFelinoAlojamento(felino);

                            break;
                        case 4:
                            break;

                        default:
                            System.out.println();
                    }
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    continuar = false;
                    break;
            }
        }
    }
}
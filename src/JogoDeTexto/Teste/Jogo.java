package JogoDeTexto.Teste;

import JogoDeTexto.Dominio.Imprimir;
import JogoDeTexto.Dominio.Inimigo;
import JogoDeTexto.Dominio.Pessoa;
import java.util.Scanner;

public class Jogo {

    private Scanner scanner;
    public Jogo(){

        scanner = new Scanner(System.in);

    }

    public  void iniciar (){

        // criando scanner para interaçao

        Imprimir imprime = new Imprimir();

        imprime.imprimirInicio01();


        System.out.println(" digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        // Consumir a nova linha pendente após nextInt()
        scanner.nextLine();

        System.out.println("digite seu sexo: ");
        char sexo = scanner.next().charAt(0);


        imprime.imprimirInicio02();

        // criando do while para opçao de jogar novamente
        do {
            // Criando uma pessoa
            Pessoa jogador = new Pessoa(nome, idade, sexo,10,5,2,100);

            // Criando um inimigo
            Inimigo inimigo = new Inimigo("Inimigo",50,50,5,200);

            //criando inimigo medio
            Inimigo inimigo2 = new Inimigo("Inimigo medio",100,200,60,200);



            imprime.imprimirInicio03();

            System.out.println("arco: +5 dano \n"+ "espada: +7 dano \n"+ "adaga: + 10 dano \n" );
            System.out.println("qual sua escolhar? ");
            char arma = scanner.next().charAt(1);

            if (arma == 'r'){

                jogador.setDano(jogador.getDano() + 5);

            }
            else if (arma == 's'){

                jogador.setDano(jogador.getDano() + 7);

            }
            else if (arma == 'd'){

                jogador.setDano(jogador.getDano() + 10);

            }

            imprime.imprimirEstastistica(jogador);

            imprime.imprimirInicio04();


            // quando a vida do inimigo ou do jogador chegar a zero, saira do while
            while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
                // Atacando o inimigo ou ser atacado
                System.out.println("Você deseja atacar " + inimigo.getNome() + "? (s/n)");
                char resposta = scanner.next().charAt(0);

                if (resposta == 's') {
                    //atacando o inimigo
                    System.out.println("Você atacou " + inimigo.getNome() + "!");
                    inimigo.setVida(inimigo.getVida() - jogador.getDano());
                    System.out.println(inimigo.getNome() + " perdeu " + jogador.getDano() + " de vida.");

                    System.out.println("a vida do inimigo e: " + inimigo.getVida());

                } else if (resposta == 'n') {
                    //inimigo te atacando
                    System.out.println("Você decidiu não atacar " + inimigo.getNome() + ".");
                    jogador.setVida(jogador.getVida() - inimigo.getDano());

                    System.out.println("a sua vida e: " + jogador.getVida());
                } else {
                    // caso clique em uma tecla errada
                    System.out.println(" Escolha inválida. Por favor, tente novamente.");
                    break;
                }
            }
            if (jogador.getVida() <= 0) {

                System.out.println("Fim do jogo!");

            } else if (inimigo.getVida() <= 0) {

                System.out.println("parabens "+ jogador.getNome()+" vc ganhou, vai para a fase 2\n");
                // aqui podemos adicionar a logica para a segunda fase

                imprime.imprimirPrimeiraFase01();

                // adicionando as estastiticas do inimigo ao jogador
                jogador.setDano(jogador.getDano() + inimigo.getDano());
                jogador.setForca(jogador.getForca() + inimigo.getForca());
                jogador.setInteligencia(jogador.getInteligencia() + inimigo.getInteligencia());

                imprime.imprimirEstastistica(jogador);

                imprime.imprimirPrimeiraFase02();

                        // quando a vida do inimigo ou do jogador chegar a zero, saira do while
                while (jogador.getVida() > 0 && inimigo2.getVida() > 0) {
                    // Atacando o inimigo ou ser atacado
                    System.out.println("Você deseja atacar " + inimigo2.getNome() + "? (s/n)");
                    char resposta = scanner.next().charAt(0);

                    if (resposta == 's') {
                        //atacando o inimigo
                        System.out.println("Você atacou " + inimigo2.getNome() + "!");
                        inimigo2.setVida(inimigo2.getVida() - jogador.getDano());
                        System.out.println(inimigo2.getNome() + " perdeu " + jogador.getDano() + " de vida.");

                        System.out.println("a vida do inimigo e: " + inimigo2.getVida());

                    } else if (resposta == 'n') {
                        //inimigo te atacando
                        System.out.println("Você decidiu não atacar " + inimigo2.getNome() + ".");
                        jogador.setVida(jogador.getVida() - inimigo2.getDano());

                        System.out.println("a sua vida e: " + jogador.getVida());
                    } else {
                        // caso clique em uma tecla errada
                        System.out.println(" Escolha inválida. Por favor, tente novamente.");
                        break;
                    }
                }
                if (jogador.getVida() <= 0) {

                    System.out.println("Fim do jogo!");

                } else if (inimigo.getVida() <= 0) {

                    System.out.println("parabens " + jogador.getNome() + " vc ganhou, vai para a fase 3\n");
                    // aqui podemos adicionar a logica para a segunda fase
                }

            }


            System.out.println("Deseja jogar novamente? (s/n)");
        } while (scanner.next().charAt(0) == 's');
            scanner.close();


    }
}
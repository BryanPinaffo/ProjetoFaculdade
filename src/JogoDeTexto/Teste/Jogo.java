package JogoDeTexto.Teste;

import JogoDeTexto.Dominio.*;

import java.util.Scanner;

public class Jogo {

    private Scanner scanner;

    public Jogo() {

        scanner = new Scanner(System.in);

    }

    public void iniciar() {

        // criando scanner para interaçao

        Imprimir imprime = new Imprimir();

        imprime.imprimirInicio01();

        // criado uma pessoa chamada jogador
        Pessoa jogador = new Pessoa(" ", 0, ' ', 10, 5, 2, 100);

        // metodo imprime onde conter perguntas sobre o jogador
        imprime.sobrePessoa(scanner, jogador);
        imprime.imprimirInicio02();

        // criando do while para opçao de jogar novamente
        do {
            // reescrito jogador
            jogador = new Pessoa(jogador.getNome(), jogador.getIdade(), jogador.getSexo(), 10, 5, 2, 100); // reescrito jogador

            // Criando um inimigo
            Inimigo inimigo = new Inimigo("Inimigo", 50, 50, 5, 200);

            //criando inimigo medio
            Inimigo inimigo2 = new Inimigo("Inimigo medio", 100, 200, 60, 200);

            // criado forma de dano
            Dano dano = new Dano();
            SomaEstastisticas somaEstastisticas = new SomaEstastisticas();

            imprime.imprimirInicio03();

            System.out.println("arco: +5 dano \n" + "espada: +7 dano \n" + "adaga: + 10 dano \n");
            System.out.println("qual sua escolhar? ");
            char arma = scanner.next().charAt(1);

            if (arma == 'r') { // verifica se vc quer um arco

                jogador.setDano(jogador.getDano() + 5); // adiciona a quantidade de dano da arma nas suas estastisticas

            } else if (arma == 's') { // verifica se vc quer uma espada

                jogador.setDano(jogador.getDano() + 7);

            } else if (arma == 'd') {

                jogador.setDano(jogador.getDano() + 10);

            }

            imprime.imprimirEstastistica(jogador);

            imprime.imprimirInicio04();

            //Metodo para dar e receber dano
            dano.DarDanoOuReceberDano(jogador, inimigo, scanner);

            if (jogador.getVida() <= 0) {// verifica se vc morreu

                System.out.println("Fim do jogo!");

            } else if (inimigo.getVida() <= 0) { // verifica se o inimigo morreu

                System.out.println("parabens " + jogador.getNome() + " vc ganhou, vai para a fase 2\n");

                // aqui podemos adicionar a logica para a segunda fase
                imprime.imprimirSomagemEstastisticas();
                // adicionando as estastiticas do inimigo ao jogador
                somaEstastisticas.Soma(jogador, inimigo);
                imprime.imprimirEstastistica(jogador);
                imprime.imprimirPrimeiraFase02();
                //Metodo para dar e receber dano
                dano.DarDanoOuReceberDano(jogador, inimigo2, scanner);

                if (jogador.getVida() <= 0) { // verifica se vc morreu

                    System.out.println("Fim do jogo!");

                } else if (inimigo.getVida() <= 0) { // verifica se o inimigo morreu

                    System.out.println("parabens " + jogador.getNome() + " vc ganhou, vai para a fase 3\n");

                    imprime.imprimirSomagemEstastisticas();
                    somaEstastisticas.Soma(jogador, inimigo2);
                    imprime.imprimirEstastistica(jogador);
                }

            }

            System.out.println("Deseja jogar novamente? (s/n)");
        } while (scanner.next().charAt(0) == 's');
        scanner.close();

    }
}
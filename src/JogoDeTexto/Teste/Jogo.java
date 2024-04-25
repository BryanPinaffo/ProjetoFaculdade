package JogoDeTexto.Teste;

import JogoDeTexto.Dominio.*;

import java.util.Scanner;

public class Jogo {
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {

        Imprimir imprime = new Imprimir();
        Fase fase = new Fase();

        imprime.imprimirInicio01();

        // criado uma pessoa chamada jogador
        Pessoa jogador = new Pessoa(" ", 0, ' ', 0, 0, 0, 0);

        // Perguntas basicas
        Acao.sobrePessoa(scanner, jogador);
        imprime.imprimirInicio02();

        // criando do while para opçao de jogar novamente
        do {
            // reescrito jogador
            jogador = new Pessoa(jogador.getNome(), jogador.getIdade(), jogador.getSexo(), 10, 5, 2, 100); // reescrito jogador

            // Criando um inimigo
            Inimigo inimigo = new Inimigo("Inimigo", 50, 50, 5, 200);

            //criando inimigo medio
            Inimigo inimigo2 = new Inimigo("Inimigo medio", 100, 200, 60, 200);


            // escolhe a primeira arma
            Acao.escolherArma(imprime,jogador,scanner);

            imprime.imprimirEstastistica(jogador);

            // inicia fase
            fase.faseUm(jogador,inimigo,scanner,imprime);

            if (jogador.getVida() <= 0) {// verifica se vc morreu

                System.out.println("Fim do jogo!");

            } else if (inimigo.getVida() <= 0) { // verifica se o inimigo morreu

                fase.recompensaFaseUm(jogador,inimigo,imprime); // soma as estastisticas do inimigo com a sua

                // inicia fase
                fase.faseDois(jogador,inimigo2,scanner,imprime);

                if (jogador.getVida() <= 0) { // verifica se vc morreu

                    System.out.println("Fim do jogo!");

                } else if (inimigo.getVida() <= 0) { // verifica se o inimigo morreu

                    fase.recompensaFaseDois(jogador,inimigo2,imprime);

                    //inicio da fase 3
                }
            }
            System.out.println("Deseja jogar novamente? (s/n)");
        } while (scanner.next().charAt(0) == 's');
        scanner.close();
    }
}
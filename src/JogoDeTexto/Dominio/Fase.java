package JogoDeTexto.Dominio;

import java.util.Scanner;

public class Fase {

    public void faseUm(Pessoa jogador, Inimigo inimigo, Scanner scanner, Imprimir imprime){
        System.out.println("Iniciando a fase 1\n");

        imprime.imprimirInicio04();
        // criado forma de dano
        Acao.darDanoOuReceberDano(jogador, inimigo, scanner);



    }

    public void recompensaFaseUm(Pessoa jogador, Inimigo inimigo, Imprimir imprime){

        imprime.imprimirSomagemEstastisticas(); // fala que vc ganhou e que vai somar as estastisticas
        Acao.somaEstastisticas(jogador, inimigo); // soma as estastisticas
        imprime.imprimirEstastistica(jogador); // imprime as novas estastisticas do jogador

    }

    public void faseDois(Pessoa jogador, Inimigo inimigo2, Scanner scanner, Imprimir imprime){
        System.out.println("Iniciando a fase 2\n");

        imprime.imprimirPrimeiraFase02();

        Acao.darDanoOuReceberDano(jogador, inimigo2, scanner);



    }

    public void recompensaFaseDois(Pessoa jogador, Inimigo inimigo2, Imprimir imprime){

        imprime.imprimirSomagemEstastisticas();
        Acao.somaEstastisticas(jogador, inimigo2);
        imprime.imprimirEstastistica(jogador);

    }
}

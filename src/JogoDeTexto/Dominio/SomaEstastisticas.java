package JogoDeTexto.Dominio;

import java.util.Scanner;

public class SomaEstastisticas {


    public void Soma(Pessoa jogador, Inimigo inimigo) {


        // adicionando as estastiticas do inimigo ao jogador
        jogador.setDano(jogador.getDano() + inimigo.getDano());
        jogador.setForca(jogador.getForca() + inimigo.getForca());
        jogador.setInteligencia(jogador.getInteligencia() + inimigo.getInteligencia());


    }
}
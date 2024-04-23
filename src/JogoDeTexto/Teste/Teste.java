package JogoDeTexto.Teste;

import JogoDeTexto.Dominio.Inimigo;
import JogoDeTexto.Dominio.Pessoa;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa jogador = new Pessoa("Player", 25, 'M');

        // Criando um inimigo
        Inimigo inimigo = new Inimigo("Inimigo", 30, 'F');


        //tributos de cada personagem
        jogador.setDano(20);
        jogador.setVida(100);
        jogador.setForca(15);
        jogador.setInteligencia(2);

        inimigo.setDano(30);
        inimigo.setVida(100);
        inimigo.setForca(15);
        inimigo.setInteligencia(2);



        // Atacando o inimigo
        for (int i = 0; (i < jogador.getVida()) || (i < inimigo.getVida());) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Você deseja atacar " + inimigo.getNome() + "? (s/n)");
            char resposta = scanner.nextLine().charAt(0);

            if (resposta == 's') {
                System.out.println("Você atacou " + inimigo.getNome() + "!");
                inimigo.setVida(inimigo.getVida() - jogador.getDano());
                System.out.println(inimigo.getNome() + " perdeu " + jogador.getDano() + " de vida.");

                System.out.println("a vida do inimigo e: " + inimigo.getVida());
                // Verifica se a vida do Ser atacado chegou a zero
                if (inimigo.getVida() <= 0) {
                    System.out.println(inimigo.getNome() + " foi derrotado!");
                    break; // Encerra o jogo
                }

            } else if (resposta == 'n') {
                System.out.println("Você decidiu não atacar " + inimigo.getNome() + ".");
                jogador.setVida(jogador.getVida() - inimigo.getDano());

                System.out.println("a sua vida e: " + jogador.getVida());
                    // Verifica se a vida do Ser atacado chegou a zero

                    if (jogador.getVida() <= 0) {
                        System.out.println(jogador.getNome() + " foi derrotado!");
                        break; // Encerra o jogo
                    }
            }
            else {
                System.out.println(" vc escolheu nenhuma das alternativas, por gentileza, inicie novamente");
                break;
            }
        }
        if(jogador.getVida() <= 0){

            System.out.println("Fim do jogo!");

        }
        else {

            System.out.println("parabens, vc ganhou, vai para a fase 2");
        }

    }
}

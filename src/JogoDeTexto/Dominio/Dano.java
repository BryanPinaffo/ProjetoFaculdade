package JogoDeTexto.Dominio;

import java.util.Scanner;

public class Dano {

    public void DarDanoOuReceberDano(Pessoa jogador, Inimigo inimigo, Scanner scanner){

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




    }
}

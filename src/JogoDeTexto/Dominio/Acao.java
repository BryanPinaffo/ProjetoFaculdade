package JogoDeTexto.Dominio;

import java.util.Scanner;

public abstract class Acao {

    protected static int armaEscolhida;


    public static int escolherArma(Imprimir imprime, Pessoa jogador, Scanner scanner) {

        imprime.imprimirInicio03();

        System.out.println("arco: +5 dano \n" + "espada: +7 dano \n" + "adaga: + 10 dano \n");
        System.out.println("qual sua escolhar? ");
        char arma = scanner.next().charAt(1);

        if (arma == 'r') { // verifica se vc quer um arco

            return armaEscolhida = 1;

        } else if (arma == 's') { // verifica se vc quer uma espada

            return armaEscolhida = 2;

        } else if (arma == 'd') {

            return armaEscolhida = 3;

        }
        return armaEscolhida = 4;

    }


    public static void sobrePessoa(Scanner scanner, Pessoa pessoa) {

        System.out.println(" digite seu nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("digite sua idade: ");
        pessoa.setIdade(scanner.nextInt());

        // Consumir a nova linha pendente após nextInt()
        scanner.nextLine();

        System.out.println("digite seu sexo: ");
        pessoa.setSexo(scanner.next().charAt(0));


    }

    public static void somaEstastisticas(Pessoa jogador, Inimigo inimigo) {


        // adicionando as estastiticas do inimigo ao jogador
        jogador.setDano(jogador.getDano() + inimigo.getDano());
        jogador.setForca(jogador.getForca() + inimigo.getForca());
        jogador.setInteligencia(jogador.getInteligencia() + inimigo.getInteligencia());


    }

    public static void darDanoOuReceberDano(Pessoa jogador, Inimigo inimigo, Scanner scanner) {
        // quando a vida do inimigo ou do jogador chegar a zero, saira do while

        if (armaEscolhida == 1) {
            while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
                // Atacando o inimigo ou ser atacado
                System.out.println("Você deseja atacar " + inimigo.getNome() + "? Escolhe entre J ou K");
                char resposta = scanner.next().charAt(0);

                if (resposta == 'J') {
                    //atacando o inimigo
                    System.out.println("Você atacou " + inimigo.getNome() + "!");
                    inimigo.setVida(inimigo.getVida() - jogador.getDano());
                    System.out.println(inimigo.getNome() + " perdeu " + jogador.getDano() + " de vida.");

                    System.out.println("a vida do inimigo e: " + inimigo.getVida());

                } else if (resposta == 'K') {
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
        } else if (armaEscolhida == 2) {
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
        } else if (armaEscolhida == 3) {
            while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
                // Atacando o inimigo ou ser atacado
                System.out.println("Você deseja atacar " + inimigo.getNome() + "Escolhe entre Z OU B");
                char resposta = scanner.next().charAt(0);

                if (resposta == 'Z') {
                    //atacando o inimigo
                    System.out.println("Você atacou " + inimigo.getNome() + "!");
                    inimigo.setVida(inimigo.getVida() - jogador.getDano());
                    System.out.println(inimigo.getNome() + " perdeu " + jogador.getDano() + " de vida.");

                    System.out.println("a vida do inimigo e: " + inimigo.getVida());

                } else if (resposta == 'B') {
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
        } else {

            System.out.println("escolha uma das opçoes disponiveis ");

        }


    }

}

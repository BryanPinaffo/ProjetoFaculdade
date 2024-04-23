package JogoDeTexto.Teste;

import JogoDeTexto.Dominio.Imprimir;
import JogoDeTexto.Dominio.Inimigo;
import JogoDeTexto.Dominio.Pessoa;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        // criando scanner para interaçao
        Scanner scanner = new Scanner(System.in);

        Imprimir imprime = new Imprimir();

        imprime.imprimirTexto01();


        System.out.println(" digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        // Consumir a nova linha pendente após nextInt()
        scanner.nextLine();

        System.out.println("digite seu sexo: ");
        char sexo = scanner.next().charAt(0);


        imprime.imprimeTexto03();

        // criando do while para opçao de jogar novamente
        do {
            // Criando uma pessoa
            Pessoa jogador = new Pessoa(nome, idade, sexo);

            // Criando um inimigo
            Inimigo inimigo = new Inimigo("Inimigo");

            //criando inimigo medio
            Inimigo inimigo2 = new Inimigo("Inimigo medio");


            //tributos de cada personagem
            jogador.setDano(20);
            jogador.setVida(100);
            jogador.setForca(15);
            jogador.setInteligencia(2);

            inimigo.setDano(30);
            inimigo.setVida(100);
            inimigo.setForca(15);
            inimigo.setInteligencia(2);

            inimigo2.setDano(60);
            inimigo2.setVida(200);
            inimigo2.setForca(30);
            inimigo2.setInteligencia(4);



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

                System.out.println("parabens "+ jogador.getNome()+" vc ganhou, vai para a fase 2\n\n");
                // aqui podemos adicionar a logica para a segunda fase

                imprime.imprimirFase02();

                // adicionando as estastiticas do inimigo ao jogador
                jogador.setDano(jogador.getDano() + inimigo.getDano());
                jogador.setForca(jogador.getForca() + inimigo.getForca());
                jogador.setInteligencia(jogador.getInteligencia() + inimigo.getInteligencia());

                System.out.println("suas estastisticas sao:");
                System.out.println("seu dano agora é " + jogador.getDano() );
                System.out.println("sua força agora é " + jogador.getForca());
                System.out.println("sua inteligencia é "+ jogador.getInteligencia());
                System.out.println("sua vida continua "+ jogador.getVida());

                imprime.imprimeFase02Texto();

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

                    System.out.println("parabens " + jogador.getNome() + " vc ganhou, vai para a fase 3\n\n");
                    // aqui podemos adicionar a logica para a segunda fase
                }

            }


            System.out.println("Deseja jogar novamente? (s/n)");
        } while (scanner.next().charAt(0) == 's');
            scanner.close();


    }
}




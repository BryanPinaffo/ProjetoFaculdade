package JogoDeTexto.Dominio;

import java.util.Scanner;

public class Imprimir {




    public void imprimirEstastistica(Pessoa pessoa) {

        System.out.println("suas estastisticas sao:");
        System.out.println("seu dano agora é " + pessoa.getDano());
        System.out.println("sua força agora é " + pessoa.getForca());
        System.out.println("sua inteligencia é " + pessoa.getInteligencia());
        System.out.println("sua vida continua " + pessoa.getVida());

    }


    public void imprimirInicio01() {

        System.out.println("Seja bem-vindo, aventureiro! Antes de adentrar neste mundo de mistérios e desafios, precisamos conhecê-lo melhor.\n " +
                "Por favor, informe seu nome, idade e sexo para que possamos personalizar sua jornada e garantir uma experiência única.\n" +
                " Prepare-se para embarcar em uma aventura épica e desvendar segredos que aguardam por você em cada esquina.\n " +
                "O destino está em suas mãos, e cada escolha moldará o curso desta incrível jornada. Está pronto para começar?\n");


    }

    public void imprimirInicio02() {


        System.out.println("Perfeito! Agora que conhecemos um pouco mais sobre você, é hora de equipar-se para a aventura que se aproxima.\n" +
                " Como bravos heróis, a escolha da arma é crucial para enfrentar os desafios que virão.\n" +
                " Por favor, selecione sua arma inicial entre as opções disponíveis.\n");

    }

    public void imprimirInicio03() {

        System.out.println(" Lembre-se, sua escolha determinará sua abordagem nos combates e desafios que encontrar pela frente.\n" +
                " Escolha sabiamente, pois seu destino aguarda sua coragem e habilidade.\n" +
                " Qual será sua arma de escolha, aventureiro?\n");

    }

    public void imprimirInicio04() {

        System.out.println("iniciando jogo...");

    }

    public void imprimirSomagemEstastisticas() {

        System.out.println("parabens, vc ganhou, todas as estasticias dele serao somadas a sua!!!\n");

    }

    public void imprimirPrimeiraFase02() {

        System.out.println("\noooo naaooo, um inimigo esta te atacando novamente, vc precisa derrota-lo\n");

    }
}

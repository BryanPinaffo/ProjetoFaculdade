package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;
import java.util.Text;

public abstract class Level 
{
    public int currentLevel = 0;

    public static void level01(Player player, Player Enemy, Text select) 
    {
        JOptionPane.showMessageDialog(null, "Iniciando a fase 1\n");

        select.imprimirInicio04();
        // criado forma de dano
        Acao.darDanoOuReceberDano(player, Player, Text);
    }

    public static void recompensaFaseUm(Player player, Player Enemy, Text select) 
    {
        select.imprimirSomagemEstastisticas(); // fala que vc ganhou e que vai somar as estastisticas
        Acao.somaEstastisticas(player, Player); // soma as estastisticas
        select.imprimirEstastistica(player); // select as novas estastisticas do player
    }

    public static void level02(Player player, Player Enemy, Text select) 
    {
        JOptionPane.showMessageDialog(null, "Iniciando a fase 2\n");

        select.imprimirPrimeiraFase02();

        Acao.darDanoOuReceberDano(player, Player2, Text);
    }

    public static void recompensaFaseDois(Player player, Player Enemy, Text select) 
    {
        select.imprimirSomagemEstastisticas();
        Acao.somaEstastisticas(player, Player2);
        select.imprimirEstastistica(player);
    }
}

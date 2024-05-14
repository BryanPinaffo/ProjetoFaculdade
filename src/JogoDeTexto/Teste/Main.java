package JogoDeTexto.Teste;
import JogoDeTexto.Dominio.Level;
import JogoDeTexto.Dominio.Player;
import JogoDeTexto.Dominio.Profile;
import JogoDeTexto.Dominio.Text;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) 
    {
        try 
        {
            Profile profile = new Profile();
            Player player = profile.createPlayer(); // Criar jogador
        
            Text text = new Text();
            Level level = new Level(text);

            // Executar níveis do jogo
            level.level01(player);
            // level.level02(player);
            // level.level03(player);
            // level.level04(player);
            // level.level05(player);

            JOptionPane.showMessageDialog(null, "Jogo concluído!");
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace(); // Imprime detalhes do erro no console
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

package JogoDeTexto.Dominio;
import java.sql.Savepoint;
import javax.swing.JOptionPane;

public class GameMenu 
{
    public static void showMenu(Player player)
    {
        String[] options = {"Novo Jogo","Jogar","Salvar","Sair"};
        String choice = Text.select("Menu", "Escolha uma opção", options);

        switch (choice) 
        {
            case "Novo Jogo":
                newGame();
            break;

            case "Jogar":

                if (player != null)
                {
                    continueGame();
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Não há jogo salvo encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    showMenu(player);
                }
            break;

            case "Salvar":

                if (player != null)
                {
                    saveGame(save, player);
                    JOptionPane.showMessageDialog(null, "Jogo salvo com sucesso!", "Salvar Jogo", JOptionPane.INFORMATION_MESSAGE);
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Não há jogo em andamento para salvar.", "Erro", JOptionPane.ERROR_MESSAGE);
                    showMenu(player);
                }
            break;

            case "Sair":
                JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Sair", JOptionPane.INFORMATION_MESSAGE);
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                showMenu(player);
            break;
        }
    }

    private static void newGame()
    {
        Profile profile = new Profile();
        Player player = new Player();
        Level level = new Level(new Text());

        level.level01(player);
    }

    private static void continueGame()
    {
        Level level = new Level(new Text());
    }

    private void saveGame(Player player)
    {
        return player;
    }
}
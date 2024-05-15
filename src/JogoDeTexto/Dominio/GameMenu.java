package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class GameMenu 
{
    public static void showMenu(Player player)
    {
        String[] options = {"Novo Jogo","Jogar","Sair"};
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
                    newGame();
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Não há jogo salvo encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
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
    
    private static void continueGame()
    {
        Level level = new Level(new Text());
    }
}
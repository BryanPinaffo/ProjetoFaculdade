package JogoDeTexto.Dominio;
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
                continueGame();
            break;

            case "Salvar":
                saveGame();
            break;

            case "Sair":
                exitGame();
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

    private static void saveGame()
    {

    }

    private static void exitGame()
    {

    }
}
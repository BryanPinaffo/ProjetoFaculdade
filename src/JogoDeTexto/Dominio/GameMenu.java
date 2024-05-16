package JogoDeTexto.Dominio;

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
                }
                
                else
                {
                    Text.showMessage("Não há jogo salvo encontrado.");
                    showMenu(player);
                }
            break;

            case "Sair":
                Text.showMessage("Obrigado por jogar!");
            break;

            default:
                Text.showMessage("Opção inválida. Tente novamente.");
                showMenu(player);
            break;
        }
    }

    private static void newGame()
    {
            Profile profile = new Profile();
            Player player = profile.createPlayer(); // Criar jogador
        
            Level level = new Level();

            // Executar níveis do jogo
            level.level01(player);
            level.level02(player);
            level.level03(player);
            level.level04(player);
            level.levelFinal(player);

            Text.showMessage("Jogo concluído");
    }
    
    private static void continueGame()
    {
        Level level = new Level();
        newGame();
    }
}
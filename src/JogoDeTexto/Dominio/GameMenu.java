package JogoDeTexto.Dominio;

public class GameMenu 
{
    // Método para exibir o menu do jogo
    public static void showMenu(Player player)
    {
        // Opções do menu
        String[] options = {"Novo Jogo","Jogar","Sair"};
        String choice = Text.select("Menu", "Escolha uma opção", options);

        // Switch-case para tratar as escolhas do jogador no menu
        switch (choice) 
        {
            case "Novo Jogo":
                // Inicia um novo jogo
                newGame();
            break;

            case "Jogar":
                // Continua um jogo salvo
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
                // Sai do jogo
                Text.showMessage("Obrigado por jogar!");
            break;

            default:
                // Tratamento de escolha inválida
                System.exit(0);
            break;
        }
    }

    public static void defeatMenu(Player player)
    {
       // Opções do menu
       String[] options = {"Jogar de novo","Sair"};
       String choice = Text.select("Menu", "Você perdeu!!", options); 

       // Switch-case para tratar as escolhas do jogador no menu
       switch (choice) 
       {
           case "Jogar de novo":
               // Inicia um novo jogo
               newGame();
           break;

           case "Sair":
               // Sai do jogo
               Text.showMessage("Obrigado por jogar!");
               System.exit(0);
           break;

           default:
                // Tratamento de escolha inválida
                System.exit(0);
            break;
       }
    }

    // Método para iniciar um novo jogo
    private static void newGame()
    {
            // Cria um novo perfil de jogador
            Profile profile = new Profile();
            Player player = profile.createPlayer();
        
            // Cria um novo objeto Level e inicia os níveis do jogo
            Level level = new Level();

            // Executa níveis do jogo
            level.level01(player);
            level.level02(player);
            level.level03(player);
            level.level04(player);
            level.levelFinal(player);

            Text.showMessage("Jogo concluído");
    }
    
    // Método para continuar um jogo salvo
    private static void continueGame()
    {
        Level level = new Level();
        newGame();
    }
}
package JogoDeTexto.Dominio;

public class Profile 
{
    private Player player;

    // Construtor que inicializa um novo jogador
    public Profile() 
    {
        this.player = new Player();
    }

    // Método para criar um novo jogador
    public Player createPlayer() 
    {
        String introMessage = "Bem-vindo(a) à EcoMetrópole, uma grande cidade medieval onde a vida floresce entre torres e vielas, " +
                              "mas as sombras da poluição e da destruição ambiental ameaçam seu equilíbrio. " +
                              "Antes de iniciar sua jornada pela sustentabilidade, permita-me conhecê-lo(a) melhor.";
        Text.showMessage(introMessage);

        // Solicita o nome do jogador
        String playerName = Text.showInput("Qual é o seu nome?");
        player.setName(playerName);

        // Solicita a idade do jogador
        String playerAge = Text.showInput("Qual a sua idade?");
        player.setAge(playerAge);

        // Configura os atributos iniciais do jogador
        player.setAttack(2);
        player.setHp(10);
        player.setXp(0);

        // Solicita a escolha de uma arma e ajusta os atributos conforme a arma escolhida
        String[] weaponOptions = {"Espada", "Arco", "Adaga"};
        String selectedWeapon = Text.select("Escolha de Arma", "Escolha uma arma:", weaponOptions);

        switch (selectedWeapon) 
        {
            case "Espada":
                player.setAttack(player.getAttack() + 5);
                player.setHp(player.getHp() + 3);
            break;

            case "Arco":
                player.setAttack(player.getAttack() + 3);
                player.setHp(player.getHp() + 5);
            break;

            case "Adaga":
                player.setAttack(player.getAttack() + 4);
                player.setHp(player.getHp() + 4);
            break;

            default:
                Text.showMessage("Ação inválida. Escolha uma arma.");
            break;
        }
        player.setWeapon(selectedWeapon);

        // Exibe mensagens confirmando a escolha da arma e inicia a jornada do jogador
        String weaponMessage = "Uau, você escolheu " + selectedWeapon + ", é uma sábia escolha!";
        Text.showMessage(weaponMessage);
        Text.showMessage("Vamos lá, é hora de iniciar sua jornada!");

        return player;
    }
}
package JogoDeTexto.Dominio;

public class Profile 
{
    private Player player;

    public Profile() 
    {
        this.player = new Player();
    }

    public Player createPlayer() 
    {
        Text.showMessage("Bem-vindo(a) à EcoMetrópole, uma grande cidade medieval onde a vida floresce entre torres e vielas, mas as sombras da poluição e da destruição ambiental ameaçam seu equilíbrio. Antes de iniciar sua jornada pela sustentabilidade, permita-me conhecê-lo(a) melhor.");

        String playerName = Text.showInput("Qual é o seu nome?");
        player.setName(playerName);

        String playerAge = Text.showInput("Qual a sua idade?");
        player.setAge(playerAge);

        player.setAttack(2);
        player.setHp(10);
        player.setXp(0);

        String[] weaponOptions = {"Espada", "Arco", "Adaga"};
        String selectedWeapon = Text.select("Escolha de Arma", "Escolha uma arma:", weaponOptions);

        switch (selectedWeapon) 
        {
            case "Espada":
                player.setAttack(player.getAttack() + 5);
                player.setHp(player.getHp() + 2);
            break;

            case "Arco":
                player.setAttack(player.getAttack() + 2);
                player.setHp(player.getHp() + 5);
            break;

            case "Adaga":
                player.setAttack(player.getAttack() + 3);
                player.setHp(player.getHp() + 4);
            break;

            default:
                Text.showMessage("Ação inválida. Escolha uma arma.");
            break;
        }
        player.setWeapon(selectedWeapon);

        return player;
    }
}
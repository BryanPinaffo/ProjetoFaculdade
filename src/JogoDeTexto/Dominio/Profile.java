package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class Profile 
{
    private Player player;
    private Text textUtil;

    public Profile() 
    {
        this.player = new Player();
        this.textUtil = new Text();
    }

    public Player createPlayer() 
    {
        String playerName = JOptionPane.showInputDialog("Qual é o seu nome?");
        player.setName(playerName);

        String playerAge = JOptionPane.showInputDialog("Qual a sua idade?");
        player.setAge(playerAge);

        player.setAttack(2);
        player.setHp(10);
        player.setXp(0);

        String[] weaponOptions = {"Espada", "Arco", "Adaga"};
        String selectedWeapon = textUtil.select("Escolha de Arma", "Escolha uma arma:", weaponOptions);

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
            JOptionPane.showMessageDialog(null, "Ação inválida. Escolha uma arma.", "Erro", JOptionPane.ERROR_MESSAGE);
            break;
        }
        player.setWeapon(selectedWeapon);

        return player;
    }
}
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
        String playerName = JOptionPane.showInputDialog("Digite seu nome:");
        player.setName(playerName);

        String playerAge = JOptionPane.showInputDialog("Qual a sua idade?");
        player.setAge(playerAge);

        player.setAttack(5);
        player.setHp(100);
        player.setXp(0);

        String[] weaponOptions = {"Espada", "Arco", "Adaga"};
        String selectedWeapon = textUtil.select("Escolha de Arma", "Escolha uma arma:", weaponOptions);
        player.setWeapon(selectedWeapon);

        return player;
    }
}
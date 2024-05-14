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

        displayPlayerInfo();

        Enemy enemy = new Enemy("Esqueleto", 8, 50); // Exemplo de criação de um inimigo
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Exemplo de batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy);
        battleSimulator.startBattle();

        return player;
    }

    private void displayPlayerInfo() 
    {
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do jogador", JOptionPane.INFORMATION_MESSAGE);        
    }

    public static void main(String[] args) 
    {
        Profile profile = new Profile();
        profile.createPlayer();
    }
}
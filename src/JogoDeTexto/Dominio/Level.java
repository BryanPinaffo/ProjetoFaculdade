package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class Level 
{
    private Text textUtil;

    public void level01(Player player) 
    {
        Profile profile = new Profile();
        
        // Exibir informações do jogador
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do Jogador", JOptionPane.INFORMATION_MESSAGE);

        // Criar um inimigo para a fase 01
        Enemy enemy = new Enemy("Esqueleto", 8, 50);
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Iniciar batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy);
        battleSimulator.startBattle();
    }
}

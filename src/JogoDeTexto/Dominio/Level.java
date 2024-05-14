package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class Level 
{
    private Text textUtil;

    public Level(Text textUtil) 
    {
        this.textUtil = textUtil;
    }

    public void level01(Player player) 
    {
        
        // Exibir informações do jogador
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do Jogador", JOptionPane.INFORMATION_MESSAGE);

        // Criar um inimigo para a fase 01
        Enemy enemy = new Enemy("Esqueleto", 8, 50);
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Iniciar batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy, textUtil);
        battleSimulator.startBattle();
    }

    /*

    public void level02(Player player) 
    {
        
        // Exibir informações do jogador
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do Jogador", JOptionPane.INFORMATION_MESSAGE);

        // Criar um inimigo para a fase 01
        Enemy enemy = new Enemy("Esqueleto", 8, 50);
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Iniciar batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy, textUtil);
        battleSimulator.startBattle();
    }

    public void level03(Player player) 
    {
        
        // Exibir informações do jogador
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do Jogador", JOptionPane.INFORMATION_MESSAGE);

        // Criar um inimigo para a fase 01
        Enemy enemy = new Enemy("Esqueleto", 8, 50);
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Iniciar batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy, textUtil);
        battleSimulator.startBattle();
    }

    public void level04(Player player) 
    {
        
        // Exibir informações do jogador
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do Jogador", JOptionPane.INFORMATION_MESSAGE);

        // Criar um inimigo para a fase 01
        Enemy enemy = new Enemy("Esqueleto", 8, 50);
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Iniciar batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy, textUtil);
        battleSimulator.startBattle();
    }

    public void levelFinal(Player player) 
    {
        
        // Exibir informações do jogador
        String playerInfo = textUtil.playerProfile(player);
        JOptionPane.showMessageDialog(null, playerInfo, "Ficha do Jogador", JOptionPane.INFORMATION_MESSAGE);

        // Criar um inimigo para a fase 01
        Enemy enemy = new Enemy("Esqueleto", 8, 50);
        String enemyInfo = textUtil.enemyEncounter(enemy);
        JOptionPane.showMessageDialog(null, enemyInfo, "Inimigo Encontrado!", JOptionPane.WARNING_MESSAGE);

        // Iniciar batalha
        BattleSimulator battleSimulator = new BattleSimulator(player, enemy, textUtil);
        battleSimulator.startBattle();
    }

    */
}

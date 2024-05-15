package JogoDeTexto.Dominio;

public class Level 
{
    private Text textUtil;

    public Level() 
    {
        this.textUtil = new Text();
    }

    public void level01(Player player) 
    {
        Text.showMessage("Nível 1: O Distrito Poluído\n" +
        "O Distrito Poluído é um labirinto de fábricas decadentes e rios enegrecidos. Criaturas mutantes vagam pelas ruas, alimentadas pelos resíduos tóxicos despejados pelas indústrias. " +
        "Seu primeiro desafio é enfrentar essas abominações, usando suas habilidades e sua arma para abrir caminho pela sujeira e pela corrupção.\n" +
        "Conforme você avança, encontra os trabalhadores locais, cujas vidas foram afetadas pela poluição desenfreada. Eles compartilham histórias de doenças causadas pelos poluentes " +
        "e da perda de meios de subsistência devido à degradação ambiental.\n" +
        "Suas palavras inflamam sua determinação, alimentando sua vontade de derrotar o Executivo Corporativo, o líder ganancioso das indústrias, " +
        "cujos lucros vêm à custa do meio ambiente e da saúde da população.");

        
        String[] options = {"Atacar o Executivo Corporativo", "Se esconder"};
        String choice = Text.select("Escolha sua ação", "O que você deseja fazer?", options);

        if (choice.equals("Atacar o Executivo Corporativo")) 
        {
            Enemy boss = new Enemy("Executivo Corporativo", 5, 20);
            String enemyInfo = textUtil.enemyEncounter(boss);
            Text.showMessage(enemyInfo);

            BattleSimulator battleSimulator = new BattleSimulator(player, boss);
            battleSimulator.startBattle();
        }

        if (player.isAlive()) 
        {
            String finalChoice = Text.select("Decisão final", "O Executivo Corporativo oferece riqueza e poder em troca de sua lealdade. O que você faz?", new String[]{"Sucumbir à ganância", "Atacar o inimigo"});
            
            if (finalChoice.equals("Atacar o inimigo")) 
            {
                Text.showMessage("Você não se deixa ser seduzido pelas riquezas oferecidas pelo Executivo Corporativo, golpeando-o com sua arma assim que seu inimigo demonstrou ter abaixado a guarda. " +
                        "Todas as suas criaturas mutantes, que dependiam de seu poder, sentem suas forças se esvaindo, morrendo logo em seguida.\n" +
                        "Parabéns, você venceu o Boss 01 e agora os trabalhadores locais poderão voltar a viver suas vidas sem serem aterrorizados pela crueldade do Executivo Corporativo e de seus servos.");
            } 
            
            else 
            
            {
                Text.showMessage("Você foi enganado pelas falácias do Executivo Corporativo para que ganhasse tempo. Seus servos, as criaturas mutantes, lhe cercam e o atacam com diversos golpes. > Você morreu.");
                System.exit(0);
            }
        }

        else 
        {
            Text.showMessage("Você corre para dentro de uma fábrica antiga e abandonada, para fugir do combate, mas é cercado por diversas criaturas mutantes e é atacado. > Você morreu.");
            System.exit(0);
        }
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

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
        Text.showMessage(textUtil.playerProfile(player)); //exibe ficha do jogador

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
            Enemy boss = new Enemy("Executivo Corporativo", 5, 30);
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
                
                Text.showMessage("Recompensas do Nível 1: " + "\n\n+20 de Vida\n+5 de Força");
                player.setHp(player.getHp() + 20);
                player.setAttack(player.getAttack() + 5);

                Text.showMessage("Experiência: 5");
                player.setXp(player.getXp() + 5);

                Text.showMessage(textUtil.playerProfile(player)); //exibe ficha do jogador
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

    public void level02(Player player) 
    {
        Text.showMessage("Nível 2: As Ruínas Subterrâneas\n" +
                "Descendo às profundezas da cidade, você se vê diante de um mundo subterrâneo de escuridão e desespero. " +
                "As Ruínas Subterrâneas são um labirinto de túneis escuros e cavernas sinistras, onde resíduos tóxicos e criaturas aberrantes são comuns.\n" +
                "Neste nível, você encontra os Refugiados das Profundezas, uma comunidade de pessoas marginalizadas que foram forçadas a viver nas entranhas da cidade devido à poluição acima. " +
                "Eles compartilham histórias de perda e sofrimento, mas também de esperança e resiliência.\n" +
                "Você se une aos refugiados, para fortalecer suas defesas, reparar equipamentos e treinar os refugiados em técnicas de combate enquanto busca pistas sobre a Engenheira Louca e suas atividades poluidoras.");

        String[] options = {"Desistir de enfrentá-la", "Enfrentar a Engenheira Louca"};
        String choice = Text.select("Decisão", "O que você decide fazer?", options);

        if (choice.equals("Desistir de enfrentá-la")) 
        {
            Text.showMessage("No caminho de volta para a comunidade dos refugiados, se depara com criaturas sombrias que o atacam até a sua morte. > Você morreu.");
            System.exit(0);
        } 
        
        else 
        {
            Enemy boss = new Enemy("Engenheira Louca", 7, 25);
            String enemyInfo = textUtil.enemyEncounter(boss);
            Text.showMessage(enemyInfo);

            BattleSimulator battleSimulator = new BattleSimulator(player, boss);
            battleSimulator.startBattle();

            if (player.isAlive()) 
            {
                Text.showMessage("Após uma batalha árdua, você derrota a Engenheira Louca e liberta as Ruínas Subterrâneas da opressão da tecnologia poluidora.\n" +
                        "Sua jornada pela sustentabilidade continua...");

                Text.showMessage("Recompensas do Nível 2: " + "\n\n+25 de Vida\n+7 de Força");
                player.setHp(player.getHp() + 25);
                player.setAttack(player.getAttack() + 7);

                Text.showMessage("Experiência: 10");
                player.setXp(player.getXp() + 5);

                Text.showMessage(textUtil.playerProfile(player)); //exibe ficha do jogador
            } 
            
            else 
            {
                Text.showMessage("Você foi derrotado pela Engenheira Louca. Os refugiados lamentam sua perda e continuam a lutar pela sobrevivência nas profundezas.");
                System.exit(0);
            }
        }
    }

    /* 

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

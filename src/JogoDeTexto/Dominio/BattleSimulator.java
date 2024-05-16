package JogoDeTexto.Dominio;

public class BattleSimulator 
{
    private Player player;
    private Enemy enemy;
    private int roundCount;
    private boolean canUseSpecialAttack;

    public BattleSimulator(Player player, Enemy enemy) 
    {
        this.player = player;
        this.enemy = enemy;
        this.roundCount = 0;
        this.canUseSpecialAttack = true;
    }

    public void startBattle() 
    {
        Text.showMessage("Início da Batalha!\nVocê está enfrentando: " + enemy.getName());

        while (player.isAlive() && enemy.isAlive()) 
        {
            roundCount++; // Contagem de rounds

            // Mostra opções de ataque
            String[] attackOptions = canUseSpecialAttack ? new String[]{"Ataque Normal", "Ataque Especial", "Curar"} : new String[]{"Ataque Normal", "Curar"};
            String selectedAttack = Text.select("Escolha seu ataque", "Escolha uma ação:", attackOptions);

            // Realiza a ação escolhida pelo jogador
            switch (selectedAttack) 
            {
                case "Ataque Normal":
                    performNormalAttack();
                break;

                case "Ataque Especial":
                    if (canUseSpecialAttack) 
                    {
                        performSpecialAttack();
                        canUseSpecialAttack = false; // Desabilita o ataque especial até a próxima restrição
                    } 
                    
                    else 
                    {
                        Text.showMessage("Você não pode usar o Ataque Especial nesta rodada.");
                    }
                break;

                case "Curar":
                    healing();
                break;
                
                default:
                    Text.showMessage("Ação inválida. Tente novamente.");
                break;
            }

            // Verifica se o inimigo está derrotado
            if (!enemy.isAlive()) 
            {
                Text.showMessage("Você derrotou o inimigo!");
                break;
            }

            // Simula ataque do inimigo
            simulateEnemyAttack();

            // Verifica se o jogador foi derrotado
            if (!player.isAlive()) 
            {
                Text.showMessage("Você foi derrotado pelo inimigo!");
                break;
            }
        }
    }

    private void performNormalAttack() 
    {
        int damage = player.getAttack(); // Ataque normal causa dano igual ao valor de ataque do jogador
        enemy.takeDamage(damage);
        Text.showMessage("Você realizou um ataque normal!\nCausou " + damage + " de dano.");
    }

    private void performSpecialAttack() 
    {
        int damage = player.getAttack() * 3; // Exemplo: ataque especial causa o triplo de dano
        enemy.takeDamage(damage);
        Text.showMessage("Você realizou um ataque especial!\nCausou " + damage + " de dano.");
    }

    private void healing() 
    {
        player.setHp(player.getHp() + 5); // Exemplo: cura restaura 3 pontos de vida
        Text.showMessage("Você se curou!\nRecuperou 3 pontos de vida.");
    }

    private void simulateEnemyAttack() 
    {
        int damage = enemy.getAttack(); // Ataque do inimigo
        player.takeDamage(damage);
        Text.showMessage("O " + enemy.getName() + " atacou você!\nCausou " + damage + " de dano.");
    }
}

package JogoDeTexto.Dominio;

public class BattleSimulator 
{
    private Player player;
    private Enemy enemy;
    private int roundCount;
    private boolean canUseSpecialAttack;

    // Construtor inicializa os atributos do simulador de batalha
    public BattleSimulator(Player player, Enemy enemy) 
    {
        this.player = player;
        this.enemy = enemy;
        this.roundCount = 0;
        this.canUseSpecialAttack = true;
    }

    // Método que inicia a batalha
    public void startBattle() 
    {
        Text.showMessage("Início da Batalha!\nVocê está enfrentando: " + enemy.getName());

        // Loop até que o jogador ou o inimigo morra
        while (player.isAlive() && enemy.isAlive()) 
        {
            roundCount++; // Incrementa a contagem de rodadas

            // Define as opções de ataque
            String[] attackOptions = canUseSpecialAttack ? new String[]{"Ataque Normal", "Ataque Especial", "Curar"} : new String[]{"Ataque Normal", "Curar"};
            String selectedAttack = Text.select("Escolha seu ataque", "Escolha uma ação:", attackOptions);

            // Switch-case para realizar a ação escolhida pelo jogador
            switch (selectedAttack) 
            {
                case "Ataque Normal":
                    performNormalAttack();
                break;

                case "Ataque Especial":
                    if (canUseSpecialAttack) 
                    {
                        performSpecialAttack();
                        canUseSpecialAttack = false; // Desabilita o ataque especial
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

            // Verifica se o inimigo foi derrotado
            if (!enemy.isAlive()) 
            {
                Text.showMessage("Você derrotou o inimigo!");
                break;
            }

            // Simula o ataque do inimigo
            simulateEnemyAttack();

            // Verifica se o jogador foi derrotado
            if (!player.isAlive()) 
            {
                Text.showMessage("Você foi derrotado pelo inimigo!");
                break;
            }
        }
    }

    // Método para realizar um ataque normal
    private void performNormalAttack() 
    {
        int damage = player.getAttack(); // Ataque normal causa dano igual ao valor de ataque do jogador
        enemy.takeDamage(damage);
        Text.showMessage("Você realizou um ataque normal!\nCausou " + damage + " de dano.");
    }

    // Método para realizar um ataque especial
    private void performSpecialAttack() 
    {
        int damage = player.getAttack() * 3; // Exemplo: ataque especial causa o triplo de dano
        enemy.takeDamage(damage);
        Text.showMessage("Você realizou um ataque especial!\nCausou " + damage + " de dano.");
    }

    // Método para curar o jogador
    private void healing() 
    {
        player.setHp(player.getHp() + 5); // Recupera pontos de vida
        Text.showMessage("Você se curou!\nRecuperou 3 pontos de vida.");
    }

    // Método para simular o ataque do inimigo
    private void simulateEnemyAttack() 
    {
        int damage = enemy.getAttack(); // Ataque do inimigo
        player.takeDamage(damage);
        Text.showMessage("O " + enemy.getName() + " atacou você!\nCausou " + damage + " de dano.");
    }
}

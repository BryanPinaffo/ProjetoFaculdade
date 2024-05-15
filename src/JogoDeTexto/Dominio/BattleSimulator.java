package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class BattleSimulator 
{
    private Player player;
    private Enemy enemy;
    private Text textUtil;
    private int roundCount;
    private boolean canUseSpecialAttack;

    public BattleSimulator(Player player, Enemy enemy, Text textUtil) 
    {
        this.player = player;
        this.enemy = enemy;
        this.textUtil = new Text();
        this.roundCount = 0;
        this.canUseSpecialAttack = true;
    }

    public void startBattle() 
    {
        JOptionPane.showMessageDialog(null, "Início da Batalha!\nVocê está enfrentando: " + enemy.getName(), "Batalha", JOptionPane.INFORMATION_MESSAGE);

        while (player.isAlive() && enemy.isAlive()) 
        {
            roundCount++; //Contagem de rounds

            // Mostra opções de ataque
            String[] attackOptions = {"Ataque Normal", "Ataque Especial", "Curar"};

            if (canUseSpecialAttack) 
            {
                attackOptions = new String[]{"Ataque Normal", "Ataque Especial", "Curar"};
            } 
            
            else 
            {
                attackOptions = new String[]{"Ataque Normal", "Curar"};
            }
            
            String selectedAttack = textUtil.select("Escolha seu ataque", "Escolha uma ação:", attackOptions);

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
                    JOptionPane.showMessageDialog(null, "Você não pode usar o Ataque Especial nesta rodada.", "Ação Inválida", JOptionPane.WARNING_MESSAGE);
                }
                break;

                case "Curar":
                    healing();
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Ação inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
            }

            // Verifica se o inimigo está derrotado
            if (!enemy.isAlive()) 
            {
                JOptionPane.showMessageDialog(null, "Você derrotou o inimigo!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            // Simula ataque do inimigo
            simulateEnemyAttack();

            // Verifica se o jogador foi derrotado
            if (!player.isAlive()) 
            {
                JOptionPane.showMessageDialog(null, "Você foi derrotado pelo inimigo!", "Derrota", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }

    private void performNormalAttack() 
    {
        int damage = player.getAttack(); // Ataque normal causa dano igual ao valor de ataque do jogador
        enemy.takeDamage(damage);
        JOptionPane.showMessageDialog(null, "Você realizou um ataque normal!\nCausou " + damage + " de dano.", "Ataque Normal", JOptionPane.INFORMATION_MESSAGE);
    }

    private void performSpecialAttack() 
    {
        // Implemente um ataque especial com efeitos adicionais
        int damage = player.getAttack() * 3; // Exemplo: ataque especial causa o triplo de dano
        enemy.takeDamage(damage);
        JOptionPane.showMessageDialog(null, "Você realizou um ataque especial!\nCausou " + damage + " de dano.", "Ataque Especial", JOptionPane.INFORMATION_MESSAGE);
    }

    private void healing() 
    {
        // Implemente a ação de cura que reduz o dano recebido
        player.setHp(player.getHp() + 3); // Exemplo: cura restaura 10 pontos de vida
        JOptionPane.showMessageDialog(null, "Você se curou!\nRecuperou 10 pontos de vida.", "Curar", JOptionPane.INFORMATION_MESSAGE);
    }

    private void simulateEnemyAttack() 
    {
        int damage = enemy.getAttack(); // Ataque do inimigo
        player.takeDamage(damage);
        JOptionPane.showMessageDialog(null, "O " + enemy.getName() + " atacou você!\nCausou " + damage + " de dano.", "Ataque Inimigo", JOptionPane.WARNING_MESSAGE);
    }
}

package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class BattleSimulator 
{
    private Player player;
    private Enemy enemy;
    private Text textUtil;

    public BattleSimulator(Player player, Enemy enemy) 
    {
        this.player = player;
        this.enemy = enemy;
        this.textUtil = new Text();
    }

    public void startBattle() 
    {
        JOptionPane.showMessageDialog(null, "Início da Batalha!\nVocê está enfrentando: " + enemy.getName(), "Batalha", JOptionPane.INFORMATION_MESSAGE);

        while (player.getHp() > 0 && enemy.getHp() > 0) 
        {
            // Mostra opções de ataque
            String[] attackOptions = {"Ataque Normal", "Ataque Especial", "Curar"};
            String selectedAttack = textUtil.select("Escolha seu ataque", "Escolha uma ação:", attackOptions);

            // Realiza a ação escolhida pelo jogador
            switch (selectedAttack) 
            {
                case "Ataque Normal":
                    performNormalAttack();
                    break;
                case "Ataque Especial":
                    performSpecialAttack();
                    break;
                case "Cura":
                    healing();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ação inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            // Verifica se o inimigo está derrotado
            if (enemy.getHp() <= 0) 
            {
                JOptionPane.showMessageDialog(null, "Você derrotou o inimigo!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            // Simula ataque do inimigo
            simulateEnemyAttack();

            // Verifica se o jogador foi derrotado
            if (player.getHp() <= 0) 
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
        int damage = player.getAttack() * 2; // Exemplo: ataque especial causa o dobro de dano
        enemy.takeDamage(damage);
        JOptionPane.showMessageDialog(null, "Você realizou um ataque especial!\nCausou " + damage + " de dano.", "Ataque Especial", JOptionPane.INFORMATION_MESSAGE);
    }

    private void healing() 
    {
        // Implemente a ação de cura que reduz o dano recebido
        player.setHp(player.getHp() + 10); // Exemplo: cura restaura 10 pontos de vida
        JOptionPane.showMessageDialog(null, "Você se curou!\nRecuperou 10 pontos de vida.", "Curar", JOptionPane.INFORMATION_MESSAGE);
    }

    private void simulateEnemyAttack() 
    {
        int damage = enemy.getAttack(); // Ataque do inimigo
        player.takeDamage(damage);
        JOptionPane.showMessageDialog(null, "O " + enemy.getName() + " atacou você!\nCausou " + damage + " de dano.", "Ataque Inimigo", JOptionPane.WARNING_MESSAGE);
    }
}

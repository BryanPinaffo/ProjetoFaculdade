package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class Text 
{
    public String select(String title, String msg, String[] options) 
    {
        Object selectedOption = JOptionPane.showInputDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (selectedOption != null) 
        {
            return selectedOption.toString();
        } 
        
        else 
        {
            return ""; // Caso o usuário cancele a seleção
        }
    }

    public String playerProfile(Player player) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Ficha do jogador:\n\n");
        sb.append("Nome: ").append(player.getName()).append("\n");
        sb.append("Idade: ").append(player.getAge()).append("\n");
        sb.append("Força: ").append(player.getAttack()).append("\n");
        sb.append("Vida: ").append(player.getHp()).append("\n");
        sb.append("Experiência: ").append(player.getXp()).append("\n");
        sb.append("Arma: ").append(player.getWeapon()).append("\n");
        return sb.toString();
    }

    public String enemyEncounter(Enemy enemy) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Você encontrou um inimigo!\n\n");
        sb.append("Nome: ").append(enemy.getName()).append("\n");
        sb.append("Força: ").append(enemy.getAttack()).append("\n");
        sb.append("Vida: ").append(enemy.getHp()).append("\n");
        return sb.toString();
    }

    public int randomInt(int min, int max) 
    {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
package JogoDeTexto.Dominio;
import javax.swing.JOptionPane;

public class GameMenu 
{
    public static void showMenu(Player player)
    {
        String[] options = {"Novo Jogo","Jogar","Salvar","Sair"};

        switch () 
        {
            case "Novo Jogo":
                
            break;

            case "Jogar":
                
            break;

            case "Salvar":
                
            break;

            case "Sair":
                
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                showMenu(player);
            break;
        }
    }
}

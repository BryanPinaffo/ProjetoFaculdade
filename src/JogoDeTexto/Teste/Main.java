package JogoDeTexto.Teste;
import JogoDeTexto.Dominio.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) 
    {
        try 
        {
            while (true) 
            {
                Player player = null;
                GameMenu.showMenu(player);
            }  
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace(); // Imprime detalhes do erro no console
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

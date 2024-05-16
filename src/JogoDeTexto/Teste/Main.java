package JogoDeTexto.Teste;
import JogoDeTexto.Dominio.*;

public class Main {
    public static void main(String[] args) 
    {
            try 
            {
                Player player = null;
                GameMenu.showMenu(player); 
            } 
            
            catch (Exception e) 
            {
                e.printStackTrace(); // Imprime detalhes do erro no console
                Text.showMessage("Erro: " + e.getMessage());
            } 
    }
}

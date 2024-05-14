package JogoDeTexto.Dominio;

import javax.swing.JOptionPane;

public class Profile 
{
    Player player;

    public static void main(String[] args) 
    {
        Profile profile = new Profile();
        Text text = new Text();
        String print, msg;

        profile.player = new Player();
        msg = "Digite seu nome: ";
        profile.player.name = JOptionPane.showInputDialog(msg);

        msg = "Qual a sua idade? ";
        profile.player.age = Integer.parseInt(JOptionPane.showInputDialog(msg));

        msg =
    }
}

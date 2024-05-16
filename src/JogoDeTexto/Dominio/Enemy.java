package JogoDeTexto.Dominio;

public class Enemy extends Player 
{
    public Enemy(String name, int attack, int hp) 
    {
        super(name, null, attack, hp, 0, null); // Passa null para idade, xp e arma
    }
}

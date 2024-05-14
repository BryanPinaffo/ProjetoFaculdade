package JogoDeTexto.Dominio;

public class Enemy extends Player
{
    private String weapon;

    public Enemy(String name, int attack, int hp, String weapon) 
    {
        super(name, attack, hp);
        this.weapon = weapon;
    }

    public String getWeapon()
    {
        return this.weapon;
    }

    public void setWeapon(String weapon) 
    {
        this.weapon = weapon;
    }
}

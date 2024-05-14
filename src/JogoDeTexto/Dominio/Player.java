package JogoDeTexto.Dominio;

public class Player 
{
    private String name;
    private String age;
    private int attack;
    private String weapon;
    private int hp;
    private int xp;

    public Player() 
    {
        // Construtor padrão
    }

    public Player(String name, String age, int attack, int hp, int xp, String weapon) 
    {
        this.name = name;
        this.age = age;
        this.attack = attack;
        this.hp = hp;
        this.xp = xp;
        this.weapon = weapon;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getAge() 
    {
        return age;
    }

    public void setAge(String age) 
    {
        this.age = age;
    }

    public int getAttack() 
    {
        return attack;
    }

    public void setAttack(int attack) 
    {
        this.attack = attack;
    }

    public String getWeapon() 
    {
        return weapon;
    }

    public void setWeapon(String weapon) 
    {
        this.weapon = weapon;
    }

    public int getHp() 
    {
        return hp;
    }

    public void setHp(int hp) 
    {
        this.hp = hp;
    }

    public int getXp() 
    {
        return xp;
    }

    public void setXp(int xp) 
    {
        this.xp = xp;
    }
}
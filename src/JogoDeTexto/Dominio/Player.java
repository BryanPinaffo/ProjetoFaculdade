package JogoDeTexto.Dominio;

public class Player 
{
    protected String name;
    protected int age;
    protected int attack;
    protected int hp;

    // Construtor da classe Pessoa

    public Player(String name, int attack, int hp) 
    {
        this.name = name;
        this.attack = attack;
        this.hp = hp;
    }

    public Player(String name, int age, int attack, int hp) 
    {
        this.name = name;
        this.age = age;
        this.attack = attack;
        this.hp = hp;
    }

    public Inimigo(String name, int attack, int hp)
    {
        super(name, attack, hp);
    }

    @Override
    public String toString() 
    {
        return name;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
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

    public int getHp() 
    {
        return hp;
    }

    public void setHp(int hp) 
    {
        this.hp = hp;
    }
}



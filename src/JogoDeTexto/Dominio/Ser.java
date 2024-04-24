package JogoDeTexto.Dominio;


public class Ser {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int dano;
    protected int vida;
    protected int inteligencia;
    protected int forca;


    // Construtor da classe Ser


    public Ser(String nome, int dano, int vida, int inteligencia, int forca) {
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
        this.inteligencia = inteligencia;
        this.forca = forca;
    }

    public Ser(String nome, int idade, char sexo, int dano, int vida, int inteligencia, int forca) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dano = dano;
        this.vida = vida;
        this.inteligencia = inteligencia;
        this.forca = forca;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}


package JogoDeTexto.Dominio;

public class Pessoa extends Ser {
    protected int dano;
    protected int vida;
    protected int inteligencia;
    protected int forca;


    public Pessoa(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
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



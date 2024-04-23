package JogoDeTexto.Dominio;



public class Ser {
    protected String nome;
    protected int idade;
    protected char sexo;


    // Construtor da classe Ser


    public Ser() {
    }

    public Ser(String nome) {
        this.nome = nome;
    }

    public Ser(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }


}


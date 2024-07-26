package jdbc;

public class Pessoa {
    private int codigo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
}

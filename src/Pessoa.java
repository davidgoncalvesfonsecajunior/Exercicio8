
public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String n, String e, String t) {

        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String e) {
        this.endereco = e;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

}


public class Animal {

    private String nome;

    public Animal(String n) {
        this.setNome(n);

    }

    public void imprime() {
        System.out.println("nome: " + this.getNome());

    }

    public void talk() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
}

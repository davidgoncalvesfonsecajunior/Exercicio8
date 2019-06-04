
public class Mamifero extends Animal {

    private int patas;

    public Mamifero(String n, int p) {

        super(n);
        this.setPatas(p);
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int p) {
        this.patas = p;
    }

}


public class Cachorro extends Mamifero {

    private boolean lateAlto;

    public Cachorro(String n, int p, boolean l) {

        super(n, p);
        this.setLateAlto(l);

    }

    @Override
    public void talk() {

        System.out.println("Som: Au Au");

    }

    public boolean isLateAlto() {
        return lateAlto;
    }

    public void setLateAlto(boolean l) {
        this.lateAlto = l;
    }

}

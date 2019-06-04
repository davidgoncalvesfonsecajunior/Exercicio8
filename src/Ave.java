
public class Ave extends Animal {

    boolean voa;

    public Ave(String n, boolean v) {
        super(n);
        this.setVoa(v);
    }

    public boolean getVoa() {
        return voa;
    }

    public void setVoa(boolean v) {
        this.voa = v;

    }

    @Override
    public void talk() {
        System.out.println("Piu-piu");

    }
}

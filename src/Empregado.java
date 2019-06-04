
public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private int imposto;

    public Empregado(String n, String e, String t, int c, double s, int i) {

        super(n, e, t);
        this.setCodigoSetor(c);
        this.setSalarioBase(s);
        this.setImposto(i);

    }

    public double calcularSalario() {

        double salario = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100));
        return salario;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int c) {
        this.codigoSetor = c;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double s) {
        this.salarioBase = s;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int i) {
        this.imposto = i;
    }

}

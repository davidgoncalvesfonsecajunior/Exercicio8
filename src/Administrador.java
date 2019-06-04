
public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String n, String e, String t, int c, double s, int i, double a) {

        super(n, e, t, c, s, i);
        this.setAjudaDeCusto(a);

    }

    @Override
    public double calcularSalario() {

        double salario = this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100)) + this.getAjudaDeCusto();
        return salario;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double a) {
        this.ajudaDeCusto = a;
    }

}

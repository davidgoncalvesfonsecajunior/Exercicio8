
public class Operario extends Empregado {

    private double valorDeproducao;
    private double comissao;

    public Operario(String n, String e, String t, int c, double s, int i, double v, double com) {

        super(n, e, t, c, s, i);
        this.setValorDeproducao(v);
        this.setComissao(com);

    }

    @Override
    public double calcularSalario() {

        double salario = (this.getSalarioBase() - (this.getSalarioBase() * (this.getImposto() / 100))) + ((this.getValorDeproducao() * (this.getComissao() / 100)));
        return salario;
    }

    public double getValorDeproducao() {
        return valorDeproducao;
    }

    public void setValorDeproducao(double v) {
        this.valorDeproducao = v;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double c) {
        this.comissao = c;
    }

}

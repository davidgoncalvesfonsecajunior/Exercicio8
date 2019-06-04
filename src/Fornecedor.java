
public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double ValorDivida;

    public Fornecedor(String n, String e, String t, double c, double d) {

        super(n, e, t);
        this.setValorCredito(c);
        this.setValorDivida(d);

    }

    public double obterSaldo() {

        double saldo = this.getValorCredito() - this.getValorDivida();
        return saldo;

    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double c) {
        this.valorCredito = c;
    }

    public double getValorDivida() {
        return ValorDivida;
    }

    public void setValorDivida(double d) {
        this.ValorDivida = d;
    }

}


public class Teste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Haw", "posto 3", "38 9 9999 8888");
        Fornecedor f = new Fornecedor("hem", "posto 3", "38 9 9999 7777", 1200, 1000);
        Empregado e = new Empregado("Scurry", "Posto 2", "38 9 9999 6666", 123456, 1500, 11);
        Administrador a = new Administrador("Swirt", "posto 2", "38 9 9999 5555", 234567, 2500, 11, 500);
        Operario o = new Operario("Jose", "todo labirinto", "000", 345678, 1500, 11, 3000, 5);

        System.out.println("saldo do fornecedor ->" + f.getNome() + " : " + f.obterSaldo());
        System.out.println("salario do empregado ->" + e.getNome() + " : " + e.calcularSalario());
        System.out.println("salario do Administrador ->" + a.getNome() + " : " + a.calcularSalario());
        System.out.println("salario do operario ->" + o.getNome() + " : " + o.calcularSalario());

    }
}

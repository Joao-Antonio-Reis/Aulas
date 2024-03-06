package Heranca2;

public class Secretaria extends Funcionario {
    String ramal;

    public Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }
}

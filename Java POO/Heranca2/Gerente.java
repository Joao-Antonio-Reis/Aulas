package Heranca2;

public class Gerente extends Funcionario{
    int sala;

    public Gerente(String nome, double salario, int sala) {
        super(nome, salario);
        this.sala = sala;
    }
}

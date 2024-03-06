package Polimorfismo;

public class ProfessorDE extends Professor{
    private double salario;

    public ProfessorDE(String n, int m, int s) {
        super(n, m, 40);
        setSalario(s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

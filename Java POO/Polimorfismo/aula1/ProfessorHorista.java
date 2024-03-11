package Polimorfismo.aula1;

public class ProfessorHorista extends Professor {
    private double salarioHora;

    public ProfessorHorista(String n, int m, int s) {
        super(n, m, s);
        setSalarioHora(s);
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    
}

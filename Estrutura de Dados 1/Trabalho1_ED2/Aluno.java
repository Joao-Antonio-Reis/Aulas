public class Aluno {

    private int matricula;
    private Double nota;
    
    public Aluno(int matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
}

package Heranca2;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Geraldo",1450,3);
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Sala: " + gerente.sala);

        Secretaria secretaria = new Secretaria("Rosy", 2800, "A50");
        System.out.println("Nome: " + secretaria.getNome());
        System.out.println("Salário: " + secretaria.getSalario());
        System.out.println("Ramal: " + secretaria.ramal);
    }
    
}

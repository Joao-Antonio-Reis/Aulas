package Heranca;

public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Geraldo");
        funcionario.setRg("123.456.789-10");
        funcionario.setCartao("RH845");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("RG: " + funcionario.getRg());
        System.out.println("Cartão: " + funcionario.getCartao());
    }
}

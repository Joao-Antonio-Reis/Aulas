package Polimorfismo.aula2;

public class Main {
    public static void main(String[] args) {
        
        Barco barco = new Barco();
        barco.mover();

        Aviao aviao = new Aviao();
        aviao.mover();

        Carro carro = new Carro();
        carro.mover();
    }
}

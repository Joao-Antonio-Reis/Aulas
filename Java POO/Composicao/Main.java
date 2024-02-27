package Composicao;

public class Main {
    public static void main(String[] args) {
        
        Direcao direcao = new Direcao();
        Motor motor = new Motor();

        direcao.setCor("Preto");
        direcao.setTamanhoRaio(24);
        direcao.setKitMultimidia(true);

        motor.setPotencia(200);
        motor.setCombustivel("Gasolina");
        motor.setChassi("123456");

        Automovel automovel = new Automovel();

        automovel.setDirecao(direcao);
        automovel.setMotor(motor);

        System.out.println("Cor: " + automovel.getDirecao().getCor());
        System.out.println("Tamanho do raio: " + automovel.getDirecao().getTamanhoRaio());
        System.out.println("Potência: " + automovel.getMotor().getPotencia());
        System.out.println("Combustível: " + automovel.getMotor().getCombustivel());
        System.out.println("Chassí: " + automovel.getMotor().getChassi());
    
    }
}

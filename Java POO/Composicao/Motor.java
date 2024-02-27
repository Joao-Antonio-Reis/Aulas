package Composicao;

public class Motor {
    private int potencia;
    private String combustivel;
    private String chassi;

    public Motor(){

    }
    public Motor(int potencia, String combustivel,String chassi){
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {

        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}

package Composicao;

public class Direcao {
    private String cor;
    private int tamanhoRaio;
    private boolean kitMultimidia;

    public Direcao(){

    }
    
    public Direcao(String cor, int tamanhoRaio, boolean kitMultimidia){
        this.cor = cor;
        this.tamanhoRaio = tamanhoRaio;
        this.kitMultimidia = kitMultimidia;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanhoRaio() {
        return tamanhoRaio;
    }
    public void setTamanhoRaio(int tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }
    
    public boolean isKitMultimidia() {
        return kitMultimidia;
    }
    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }
}

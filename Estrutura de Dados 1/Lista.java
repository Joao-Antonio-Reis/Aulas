public class Lista {
    
    private static class Celula {
        Object item;
        Celula prox;
    }

    private Celula primeiro;
    private Celula ultimo;
    private Celula pos;
    
    public Celula getPos() {
        return pos;
    }
    public void setPos(Celula pos) {
        this.pos = pos;
    }
    
    public Celula getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Celula primeiro) {
        this.primeiro = primeiro;
    }
    
    public Celula getUltimo() {
        return ultimo;
    }
    public void setUltimo(Celula ultimo) {
        this.ultimo = ultimo;
    }

    // Cria uma Lista vazia

    public Lista() {
        primeiro = new Celula ( );
        ultimo = primeiro;
        primeiro.prox = null;
    }

    public void imprimirLista(){
        Celula atual = primeiro;
        do{
            System.out.println(atual.item);
            atual = atual.prox;
        }while(atual != null);
    }

    public void insereInicio(Object x){
        Celula novo = new Celula();
        Celula aux = new Celula();
        primeiro.prox = novo;
        novo.item = x;
        novo.prox = aux;
        if(primeiro == ultimo){
            ultimo = novo;
        }
    }
}

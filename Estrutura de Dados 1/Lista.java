public class Lista {
    
    private static class Nodo {
        Object item;
        Nodo prox;
    }

    private Nodo primeiro;
    private Nodo ultimo;
    private Nodo pos;
    
    public Nodo getPos() {
        return pos;
    }
    public void setPos(Nodo pos) {
        this.pos = pos;
    }
    
    public Nodo getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }
    
    public Nodo getUltimo() {
        return ultimo;
    }
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    // Cria uma Lista vazia

    public Lista() {
        primeiro = new Nodo();
        ultimo = primeiro;
        primeiro.prox = null;
    }

    public void imprimirLista(){
        Nodo atual = primeiro.prox;
        do{
            System.out.println(atual.item);
            atual = atual.prox;
        }while(atual != null);
    }

    public void insereInicio(Object x){
        Nodo novo = new Nodo();
        Nodo aux = new Nodo();
        primeiro.prox = novo;
        novo.item = x;
        novo.prox = aux;
        if(primeiro == ultimo){
            ultimo = novo;
        }
    }

    public void insereFinal(Object x) {
        ultimo.prox = new Nodo();
        ultimo = ultimo.prox;
        ultimo.item = x;
        ultimo.prox = null;
    }
    
    public Object removeInicio() throws Exception{
        if(ultimo.prox == null){
            throw new Exception("Erro : Lista vazia");
        }
        Nodo aux = primeiro;
        Nodo q = aux.prox;
        Object item = q.item;
        aux.prox = q.prox;
        if (aux.prox == null)
        ultimo = aux;
        return item;
    }

    public int contarLista (Lista lista) {
        int cont = 0;
        Nodo atual = lista.primeiro.prox;
        while (atual != null) {
            cont = cont + 1;
            atual = atual.prox;
        }
        System.out.println(cont);
        return cont;
    }

// Exercicio 1

    public void vetorParaLista(){
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < vetor.length; i++){
            ultimo.prox = new Nodo();
            ultimo = ultimo.prox;
            ultimo.item = vetor[i];
        }
        ultimo.prox = null;
    }

// Exercicio 2

    public void ListaParaVetor(int tamanho) {
        Object vetor[] = new Object[tamanho];
        for(int i = 0; i < tamanho; i++){
            insereFinal(i);
            vetor[i] = ultimo.item;
        }
        for(int j = 0; j < vetor.length; j++){
            System.out.println(vetor[j]);
        }
    }

// Exercicio 3

    public void concatenaListas(Lista lista1, Lista lista2) {
        Nodo atual = lista1.primeiro.prox;
        Lista lista3 = new Lista();

        while (atual != null) {
            lista3.insereFinal(atual.item);
            atual = atual.prox;
        }

        atual = lista2.primeiro.prox;
        while (atual != null) {
            lista3.insereFinal(atual.item);
            atual = atual.prox;
        }

        lista3.imprimirLista();
    }


// Exercicio 4

    public void removeNPrimeiros(Lista lista,int quant) throws Exception {
        for(int i = 0; i < quant; i++){
            removeInicio();
        }
        imprimirLista();
    }
}

// Exercicio 5


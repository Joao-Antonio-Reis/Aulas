public class ListaAluno {
    
    private static class Nodo {
        Aluno aluno;
        Nodo prox;
    }

    public ListaAluno() {
        primeiro = new Nodo();
        ultimo = primeiro;
        primeiro.prox = null;
    }

    private Nodo primeiro;
    private Nodo ultimo;
    
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

    public void insereFinal(Aluno x) {
        // aloca espaco de memoria e coloca na lista
        ultimo.prox = new Nodo();
        // ultimo referencia o novo ultimo
        ultimo = ultimo.prox;
        ultimo.aluno = x;
        ultimo.prox = null;
        }

    public void insereInicio(Aluno x) {
        Nodo novo = new Nodo();
        novo.aluno = x;
        novo.prox = primeiro.prox;
        primeiro.prox = novo;
        if (ultimo == primeiro) {
            ultimo = novo;
        }
    }

    public void insereMeio(Aluno x) {
        Nodo novoAluno = new Nodo();
        novoAluno.aluno = x;
        Nodo novo = new Nodo();
        Nodo atual = primeiro;
        while (atual.prox!=null && atual.aluno.getNota() < novoAluno.aluno.getNota())
            atual = atual.prox;
        Nodo q = atual.prox;
        atual.prox = novo;
        novo.aluno = x;
        novo.prox = q;
        if (atual == ultimo) {
        ultimo = novo;
        }
    }

    public int contarLista (ListaAluno lista) {
        int cont = 0;
        Nodo atual = lista.primeiro.prox;
        while (atual != null) {
            cont = cont + 1;
            atual = atual.prox;
        }
        System.out.println(cont);
        return cont;
    }

    public void insercaoOrdem(ListaAluno lista) {
        
    }
    
}

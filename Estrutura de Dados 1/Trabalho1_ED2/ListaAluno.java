

public class ListaAluno {
    
    private static class Nodo {
        Aluno aluno;
        Nodo prox;
    }

    private Nodo primeiro;
    private Nodo ultimo;

    public ListaAluno() {
        primeiro = new Nodo();
        ultimo = primeiro;
        primeiro.prox = null;
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

    public boolean vazia () {
        return (primeiro == ultimo);
    }

    public void imprimir() {
        Nodo aux = primeiro.prox;
        while (aux != null ) {
        System.out.println("Matrícula: " + aux.aluno.getMatricula());
        System.out.println("Nota: " + aux.aluno.getNota());
        aux = aux.prox;
        }
    }

    public int contarLista (ListaAluno lista) {
        int cont = 0;
        Nodo atual = lista.primeiro.prox;
        while (atual != null) {
            cont = cont + 1;
            atual = atual.prox;
        }
        System.out.println("O tamanho da lista é: "+ cont);
        return cont;
    }

    public void insereFinal(Aluno x) {
        ultimo.prox = new Nodo();
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

    public void insereOrdenado(Aluno novoAluno) {
        Nodo novo = new Nodo();
        novo.aluno = novoAluno;
    
        Nodo atual = primeiro;
        Nodo anterior = null;
    
        // Encontrar o local correto para inserir o novo aluno, mantendo a lista ordenada por nota
        while (atual != null && (atual.aluno == null || atual.aluno.getNota() > novoAluno.getNota())) {
            anterior = atual;
            atual = atual.prox;
        }
    
        // Se o novo aluno deve ser inserido no início da lista
        if (anterior == null) {
            novo.prox = primeiro;
            primeiro = novo;
        } else {
            novo.prox = atual;
            anterior.prox = novo;
        }
    
        // Atualizar o ponteiro 'ultimo' se o novo aluno for inserido no final da lista
        if (atual == null) {
            ultimo = novo;
        }
    }

    public void imprimeLista() {
        Nodo atual = primeiro.prox;
        int i = 1;
        while (atual != null) {
            System.out.println("Aluno " + i + ":");
            System.out.println("Nota: " + atual.aluno.getNota());
            System.out.println("Matrícula: " + atual.aluno.getMatricula());
            System.out.println("\n");
            atual = atual.prox;
            i++;
        }
    }

    public void cadastroAluno(Aluno x) throws Exception {
        Nodo aux = primeiro;
        Aluno aluno = x;
        if (vazia())
            throw new Exception("Erro: Lista Vazia");
        while(aux.prox != null && !aux.prox.equals(aluno.nota))
            aux = aux.prox;
        if(aux.prox == null){
        }
    }
}

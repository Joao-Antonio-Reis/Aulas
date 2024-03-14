public class Listateste {
    public static void main(String[] args) throws Exception {
        
        Lista lista1 = new Lista();
        lista1.insereFinal(1);
        lista1.insereFinal(2);
        lista1.insereFinal(3);
        lista1.insereFinal(4);
        lista1.contarLista(lista1);
    }
}
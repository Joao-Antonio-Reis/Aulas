package Trabalho1_ED2;
import java.util.Scanner;
public class TesteListaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaAluno listaPrincipal = new ListaAluno();
        
        int menuEscolha = 0 ;
        while (true != false) {
            System.out.println("==================================================");
            System.out.println("Escolha umas das opções abaixo!!!");
            System.out.println("==================================================");
            System.out.println();
            System.out.println("1 - Adicionar Aluno na Lista.");
            System.out.println("2 - Remover Aluno da Lista.");
            System.out.println("3 - Buscar dados de Alunos.");
            System.out.println("4 - Tamanho da Lista.");
            System.out.println("5 - Sair.");
            System.out.println("Digite '1','2','3','4' ou '5': ");
            menuEscolha = sc.nextInt();
            switch (menuEscolha) {
                case 1:
                    System.out.println("Digite a matrícula: ");
                    int matricula = sc.nextInt();
                    System.out.println("Digite a nota: ");
                    double nota = sc.nextDouble();
                    Aluno aluno = new Aluno(matricula, nota);
                    listaPrincipal.insereOrdenado(aluno);
                    break;

                case 2:
                    listaPrincipal.imprimeLista();
                    break;
                
                case 3:

                    break;

                case 4:
                    listaPrincipal.contarLista(listaPrincipal);
                    break;

                case 5:

                    return;
            
                default:
                    break;
            }
        }
    }
}

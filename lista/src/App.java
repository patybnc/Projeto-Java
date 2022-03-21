import java.util.ArrayDeque;
import java.util.ArrayList;

public class App {    

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        ArrayList<Integer> lista  = new ArrayList<>(5);              

        System.out.println("Inserindo os números 1,2,3,4,5 na lista.");

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(lista);
        System.out.println("---------------------------------------------------------");
        System.out.println("Removendo os dados da célula inicial da lista.");

        while (!lista.isEmpty()) {
        lista.remove(0);
            System.out.println(lista);            
        }
            System.out.println("Lista vazia!");
            System.out.println("-----------------------------------------------------");

            System.out.println("Inserindo os dados da lista na pilha.");
            ArrayDeque<Integer> pilha  = new ArrayDeque<>(5);
            
            pilha.push(1);
            pilha.push(2);
            pilha.push(3);
            pilha.push(4);
            pilha.push(5);

            System.out.println(pilha);
            System.out.println("------------------------------------------------------");
            System.out.println("Remove os dados da pilha. ");

            pilha.clear();

            System.out.println(pilha);
            System.out.println("-------------------------------------------------------");

            while (!pilha.isEmpty()) {
                pilha.pop();
                System.out.println(pilha);                
            }
                System.out.println("Inserindo os dados da pilha na fila. ");
                ArrayDeque<Integer> fila  = new ArrayDeque<>(10);

                fila.add(1);
                fila.add(2);
                fila.add(3);
                fila.add(4);
                fila.add(5);      
                //fila.add(0);
               //fila.add(0);
                //fila.add(0);
                //fila.add(0);
               //fila.add(0);        

                System.out.println(fila);
                System.out.println("-------------------------------------------------------");
                System.out.println("Adicionando os números 6,7,8,9,10 na lista. ");

                //lista.add(0);
                //lista.add(0);
                //lista.add(0);
                //lista.add(0);
                //lista.add(0);
                lista.add(6);
                lista.add(7);
                lista.add(8);
                lista.add(9);
                lista.add(10);

                System.out.println(lista);
                System.out.println("-------------------------------------------------------");
                System.out.println("Removendo os dados das células iniciais da lista.");

                while (!lista.isEmpty()) {
                    lista.remove(0);
                    System.out.println(lista);
                    System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
                }
                    System.out.println("Lista vazia");                    
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Inserindo os dados da lista na pilha.");

                    pilha.push(6);
                    pilha.push(7);
                    pilha.push(8);
                    pilha.push(9);
                    pilha.push(10);

                    System.out.println(pilha);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Removendo os dados da pilha.");

                    pilha.clear();

                    System.out.println(pilha);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Inserindo os dados da pilha na fila.");

                    fila.add(6);
                    fila.add(7);
                   fila.add(8);
                   fila.add(9);
                   fila.add(10);
                
                    System.out.println(fila);

                }
}

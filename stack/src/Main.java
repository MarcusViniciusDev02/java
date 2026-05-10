import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Instância
        //Queue é uma subclasse do linked list.
        //Queue é Fifo -> First in first out.
        Queue<Integer> queue = new LinkedList<>();
        //Adiciona elemento.
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        while (!queue.isEmpty()) {
            //Mostra o próximo elemento que vai sair da lista.
            System.out.println(queue.peek());
            //Tira o elemento da lista.
            queue.poll();
        }

        System.out.println("Queue está vazia.");

    }
}

package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Naruto");
        queue.peek();
        queue.poll();
    }
}

/*
* add - Adiciona elemento na fila
* peek - Vê qual o primeiro elemento da fila.
* poll - Retira elemento da fila
*
* */

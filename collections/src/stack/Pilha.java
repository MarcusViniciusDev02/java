package stack;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        for (String item : ninjaStack){
            System.out.println(item);
        }
        ninjaStack.pop();
        System.out.println(ninjaStack.peek());
        System.out.println("Stack atual: " + ninjaStack);
    }
}
//Stack é uma pilha.
//O último elemento se torna o primeiro.
//push - Coloca elemento na pilha
//pop - Tira o elemento da lista.
//peek - Olha qual o próximo elemento da lista.
//size - Número de elementos dentro da Stack.
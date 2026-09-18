package list;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //Array
        //Arrays são estáticos, não alteram de tamanho.
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        //Printa a memória onde está alocado o meu array.
        System.out.println("Printando Array " + ninjasArray);
        //Printando um elemento específico
        System.out.println(ninjasArray[0]); //Naruto

        //Lists - São dinâmicas (aumentam ou diminuem conforme precisar)
        List<String> lista = new ArrayList<>();
        lista.add("Naruto"); //Adiciona um elemento a lista.
        lista.add("Sasuke");
        lista.add("Sakura");
        lista.add("Ino");
        lista.add("Shikamaru");
        lista.add("Joji");
        System.out.println(lista);
        lista.remove("Sasuke"); //Remove da lista.
        System.out.println(lista);
        lista.set(0, "Kakashi"); //Altera o valor de um elemento a partir do seu índice.
        System.out.println(lista);
        System.out.println(lista.size()); //Retorna o tamanho da lista.
    }


}



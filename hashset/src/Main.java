import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new LinkedList<>();

        lista.add("Naruto");
        lista.add("Sasuke");
        lista.add("Sakura");
        lista.add("Naruto");//Foi pra casa do krl.

        //Instancia
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(lista);
        ninjasSet.remove("Sakura"); //Remove por valor.

        for (String ninja : ninjasSet) {
            System.out.println(ninja);
        }


    }
}

// Diferença entre HashSet e List
// Set ignora itens duplicados dentro da lista. (Não trabalha com duplicatas).
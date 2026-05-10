import java.util.LinkedList;
import java.util.Scanner;

public class ListaDeNinjas<T> {
    private LinkedList<T> listaNinjas;
    private Scanner entrada = new Scanner(System.in);
    public ListaDeNinjas() {
        this.listaNinjas = new LinkedList<>();
    }

    public void adicionarNinja(T ninja) {
        this.listaNinjas.add(ninja);
    }

    public void adicionarPrimeiroNinja(T ninja) {
        this.listaNinjas.addFirst(ninja);
    }

    public void deletarPrimeiroNinja() {
        this.listaNinjas.removeFirst();
    }

    public void exibirNinjas() {
        for (T ninja : this.listaNinjas) {
            System.out.println(ninja);
        }
    }

    public void mostrarNinjaEspecifico(int entrada) {
        T ninja = this.listaNinjas.get(entrada);
        System.out.println(ninja);
    }


    public LinkedList<T> getListaNinjas() {
        return listaNinjas;
    }

    public void setListaNinjas(LinkedList<T> listaNinjas) {
        this.listaNinjas = listaNinjas;
    }
}

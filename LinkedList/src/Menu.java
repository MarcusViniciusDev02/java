import java.util.Scanner;

public class Menu {
    private Scanner entrada = new Scanner(System.in);
    private ListaDeNinjas<Object> listaNinjas;

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public ListaDeNinjas<Object> getListaNinjas() {
        return listaNinjas;
    }

    public void setListaNinjas(ListaDeNinjas<Object> listaNinjas) {
        this.listaNinjas = listaNinjas;
    }
}

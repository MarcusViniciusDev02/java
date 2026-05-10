import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T>{
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }
    //adicionar adicionar ferramenta
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }
    //mostrar ferramenta
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }

    public List<T> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }
}

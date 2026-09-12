import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> listaGenerica;

    public BolsaGenerica() {
        this.listaGenerica = new ArrayList<>();
    }

    //Colocar equipamentos genéricos
    public void adicionarEquipamentos(T equipamento) {
        if (equipamento == null) {
            System.out.println("Equipamento não existe");
        } else {
            listaGenerica.add(equipamento);
        }
    }

    //Criei minha própria busca de índice.
    public void removerEquipamento(int indice) {
        if (indice >= 0 && indice < listaGenerica.size()) {
            T removido = listaGenerica.remove(indice);
            System.out.println(removido + " foi removido.");
        } else {
            System.out.println("Índice inválido");
        }
    }

    public List<T> getListaGenerica() {
        return listaGenerica;
    }

    public void setListaGenerica(List<T> listaGenerica) {
        this.listaGenerica = listaGenerica;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + listaGenerica.toString();
    }
}

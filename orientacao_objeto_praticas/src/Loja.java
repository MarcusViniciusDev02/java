import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja<T extends Produto> {
    private Scanner ent = new Scanner(System.in);
    private List<T> listaDeProdutos;

    public Loja() {
        listaDeProdutos = new ArrayList<>();
    }


    public void adicionarEstoque(T produto) {
        if (produto == null) {
            System.out.println("ERRO: Produto não pode ser nulo!");
            return;
        }

        // Verifica se o produto já existe na lista
        for (T p : listaDeProdutos) {
            if (p.getCodigo() == produto.getCodigo()) {
                System.out.println("ERRO: Produto com código " + produto.getCodigo() +
                        " (" + produto.getNome() + ") já está cadastrado!");
                return;
            }
        }
    }

    public void removerItem(int codigo) {
        for (T p : listaDeProdutos) {
            if (codigo == p.getCodigo()) {
                System.out.println("Produto encontrado");

                System.out.println("Deseja remover produto?");
                String resp = ent.nextLine();

                if (resp.equalsIgnoreCase("Sim")) {
                    System.out.println("Produto removido");
                    listaDeProdutos.remove(p);
                    break;
                }
            }
        }

        System.out.println("Produto removido.");





    }

    public void mostrarItem(T produto) {
        System.out.println(produto);
    }

    public List<T> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<T> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

}

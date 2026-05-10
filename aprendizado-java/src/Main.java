public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsa = new BolsaNinja<>();
        bolsa.adicionarFerramenta(new Kunai("Kunai"));
        bolsa.adicionarFerramenta(new Shuriken("Shuriken"));

        bolsa.mostrarFerramentas();
    }
}

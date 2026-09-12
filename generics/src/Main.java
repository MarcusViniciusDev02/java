public class Main {
    public static void main(String[] args) {
        Kunai kunai = new Kunai("Kunai de ferro", 1);
        Pergaminho pergaminho = new Pergaminho("Pergaminho de fogo", 2);
        Shuriken shuriken = new Shuriken("Shuriken de prata", 3);

        BolsaGenerica<EquipamentosNinja> bolsa = new BolsaGenerica<>();
        bolsa.adicionarEquipamentos(kunai);
        bolsa.adicionarEquipamentos(pergaminho);
        bolsa.adicionarEquipamentos(shuriken);
        bolsa.removerEquipamento(1);
        System.out.println(bolsa);


    }
}
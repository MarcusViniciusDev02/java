public class Main {
    public static void main(String[] args) {
        ListaDeNinjas<Object> registroNinja = new ListaDeNinjas<>();

        registroNinja.adicionarNinja(new Uzumaki("Naruto", 18, "Folha"));
        registroNinja.adicionarNinja(new Uzumaki("Kushina", 30, "Folha"));
        registroNinja.adicionarNinja(new Uzumaki("Nagato", 30, "Chuva"));
        registroNinja.adicionarNinja(new Hatake("Kakashi", 30, "Folha"));
        registroNinja.adicionarNinja(new Uchiha("Sasuke", 19, "Folha"));
        registroNinja.adicionarNinja(new Haruno("Sakura", 19, "Folha"));
        registroNinja.adicionarNinja(new Hyuga("Hinata", 19, "Folha"));

        System.out.println("Lista de ninjas:");
        registroNinja.exibirNinjas();

        registroNinja.adicionarPrimeiroNinja(new Hyuga("Neji", 20, "Folha"));

        System.out.println("\nLista de ninjas atualizada com um novo ninja em primeiro.");
        registroNinja.exibirNinjas();


        System.out.println("\nLista de ninjas atualizada com primeiro ninja deletado ");
        registroNinja.deletarPrimeiroNinja();
        registroNinja.exibirNinjas();

        System.out.println("\nAcessando um ninja específico. ");
        registroNinja.mostrarNinjaEspecifico(0);


    }
}
public record NinjaRecord(String nome, String email, int telefone) {
    public void falaroNome(){
        System.out.println("Eu sou " + nome);
    }
}
/*
* Records
    Economiza código
    Todos os atributos são final por padrão.
    Quando o valor de uma classe não necessitar de alteração, eu posso utilizar um record.

* */
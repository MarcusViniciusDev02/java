public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortavel", 4),
    A("Dificil", 6),
    S("Altissimo", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}


//utilizar quando não for mudar.
//Posso usar para dias da semana, meios de pagamento (boleto, dinheiro, crédito...)
//Os elementos possuem uma única funcionalidade.
//
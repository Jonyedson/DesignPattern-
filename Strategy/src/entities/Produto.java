package entities;

public abstract class Produto {

    protected Double price;
    protected Desconto desconto;

    
    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public void pagamentoAvista() {

    }

}

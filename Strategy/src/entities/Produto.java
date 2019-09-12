package entities;

public abstract class Produto {

    protected Double price;
    protected Desconto desconto;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public void pagamentoAvista() {

    }

}

package entities;

public abstract class Produto {
    protected Double price;
    
    public abstract void pagamentoAvista(Double price);
    public abstract void pagamentoParcelado(Double Price);
    
    
}

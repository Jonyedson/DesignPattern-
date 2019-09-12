package entities;

public abstract class Produto {
    private Double price;
    
    public abstract void pagamentoAvista();
    public abstract void pagamentoParcelado();
    
    
}

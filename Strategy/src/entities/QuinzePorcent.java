package entities;

public class QuinzePorcent implements  Desconto{

    @Override
    public Double desconto(Double price) {
        return 0.15 *price ;
    }
    
}

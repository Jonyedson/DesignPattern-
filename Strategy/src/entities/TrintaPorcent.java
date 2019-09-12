package entities;

public class TrintaPorcent implements Desconto{

    @Override
    public Double desconto(Double price) {
        return price;
    }
    
}

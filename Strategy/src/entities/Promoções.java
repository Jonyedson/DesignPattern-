package entities;

public class Promoções implements Desconto{

    @Override
    public Double desconto(Double price) {
        return 0.50 * price;
    }
    
}

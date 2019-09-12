package entities;

public class TrintaPorcent implements Desconto{

    @Override
    public Double desconto(Double price) {
        return 0.30 * price;
    }
    
}

package entities;

public class PorcentQuinze implements  Desconto{

    @Override
    public Double desconto(Double price) {
        return 0.15 *price ;
    }
    
}

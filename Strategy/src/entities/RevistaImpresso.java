package entities;

public class RevistaImpresso extends Revista {

    public RevistaImpresso() {
        this.price = 30.00;
        desconto = new PorcentTrinta();
    }
    
    
    @Override
    public void pagamentoAvista() {
        System.out.println("Valor da revista impresso: \n" + this.price);
        System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
    }

}

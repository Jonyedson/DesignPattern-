package entities;

public class RevistaDigital extends Revista {

    public RevistaDigital() {
        this.price = 30.00;
        desconto = new PorcentQuinze();
    }

    
    @Override
    public void pagamentoAvista() {
        System.out.println("Valor da revista digital: \n" + this.price);
        System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
    }

}

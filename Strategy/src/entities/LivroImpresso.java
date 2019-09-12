package entities;

public class LivroImpresso extends Livro {

    public LivroImpresso() {
        this.price = 100.00;
        desconto = new PorcentQuinze();
    }
    
    
    @Override
    public void pagamentoAvista() {
        System.out.println("Valor do livro impresso: \n" + this.price);
        System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
    }

}

package entities;

public class LivroDigital extends Livro {

    public LivroDigital() {
        this.price = 100.00;
        desconto = new PorcentTrinta();
    }

    @Override
    public void pagamentoAvista() {
        System.out.println("Valor do Livro Digital: " + this.price);
        System.out.println("Valor com desconto: " + (price - desconto.desconto(this.price)));
    }

}

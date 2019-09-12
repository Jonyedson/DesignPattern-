package entities;

public class TabuleiroDigital extends JogoTabuleiro {

    public TabuleiroDigital() {
        this.price = 25.00;
        desconto = new PorcentTrinta();
    }

    @Override
    public void pagamentoAvista() {
        System.out.println("Valor do tabuleiro digital: \n" + this.price);
        System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
    }

}

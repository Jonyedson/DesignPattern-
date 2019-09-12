package entities;

public class TabuleiroFisico extends JogoTabuleiro {

    public TabuleiroFisico() {
        this.price = 50.00;
        desconto = new PorcentTrinta();
    }

    
    @Override
    public void pagamentoAvista() {
        System.out.println("Valor do tabuleiro fisico: \n" + this.price);
        System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
    }

}

package entities;

public class VideoGameFisico extends JogoVideoGame {

    public VideoGameFisico() {
        this.price = 50.00;
        desconto = null;
    }

    @Override
    public void pagamentoAvista() {
        if (desconto != null) {
            System.out.println("Valor do video game fisico: \n" + this.price);
            System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
        } else {
            System.out.println("Valor do video game fisico: \n" + this.price);
            System.out.println("Sem desconto no momento");
        }
    }

}

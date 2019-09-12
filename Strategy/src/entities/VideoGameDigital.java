package entities;

public class VideoGameDigital extends JogoVideoGame {

    public VideoGameDigital() {
        this.price = 50.00;
        desconto = null;
    }

    @Override
    public void pagamentoAvista() {
        if (desconto != null) {
            System.out.println("Valor do video game digital: \n" + this.price);
            System.out.println("Valor com desconto: \n" + (price - desconto.desconto(this.price)));
        } else {
            System.out.println("Valor do video game digital: \n" + this.price);
            System.out.println("Sem desconto no momento");
        }
    }

}

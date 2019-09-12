package Application;

import entities.LivroDigital;
import entities.Produto;
import entities.PorcentQuinze;
import entities.Promoções;
import entities.TabuleiroDigital;
import entities.VideoGameDigital;
import entities.VideoGameFisico;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produto product = new VideoGameDigital();
        Produto product2 = new VideoGameFisico();
        
        product.pagamentoAvista();
        product.setDesconto(new Promoções());
        product.pagamentoAvista();
        System.out.println(" ===================");
        product2.pagamentoAvista();
        product2.setDesconto(new Promoções());
        product2.pagamentoAvista();
    }

}

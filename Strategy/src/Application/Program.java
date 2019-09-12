package Application;

import entities.LivroDigital;
import entities.Produto;
import entities.PorcentQuinze;
import entities.TabuleiroDigital;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Produto product = new LivroDigital();
        Produto product2 = new TabuleiroDigital();
        product.pagamentoAvista();
        product2.pagamentoAvista();
        product.setDesconto(new PorcentQuinze());
        product2.setDesconto(new PorcentQuinze());
        product.pagamentoAvista();
        product2.pagamentoAvista();

    }

}

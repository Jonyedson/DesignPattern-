package Application;

import entities.LivroDigital;
import entities.Produto;
import entities.QuinzePorcent;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto product = new LivroDigital();
        product.pagamentoAvista();
        
        product.setDesconto(new QuinzePorcent());
        
        product.pagamentoAvista();
        sc.close();
    }

}

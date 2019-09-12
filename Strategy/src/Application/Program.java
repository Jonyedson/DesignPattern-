package Application;

import entities.Produto;
import entities.TabuleiroDigital;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto product = new TabuleiroDigital();
        
        System.out.println("Digite um valor :");
        double price = sc.nextDouble();
        product.pagamentoAvista(price);
        sc.close();
    }

}

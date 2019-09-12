package entities;

public class LivroImpresso extends Livro {

    @Override
    public void pagamentoAvista() {
        this.price = price;
    }

}

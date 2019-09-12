package entities;

public class LivroImpresso extends Livro {

    @Override
    public void pagamentoAvista() {
        
    }

    @Override
    public void pagamentoParcelado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

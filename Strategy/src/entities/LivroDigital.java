package entities;

public class LivroDigital extends Livro {

    public LivroDigital() {
    }

    
    @Override
    public void pagamentoAvista(Double Price) {
        
    }

    @Override
    public void pagamentoParcelado(Double Price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

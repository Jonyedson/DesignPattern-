package entities;

public class LivroImpresso extends Livro {
    
    
    @Override
    public void pagamentoAvista(Double price) {
        
    }

    @Override
    public void pagamentoParcelado(Double Price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

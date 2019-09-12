package entities;

public class RevistaDigital extends Revista {

    @Override
    public void pagamentoAvista(Double price) {
        
    }

    @Override
    public void pagamentoParcelado(Double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

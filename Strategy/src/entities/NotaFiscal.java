package entities;


import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    List<Produto> product = new ArrayList<>();
    
    
    public List<Produto> getProduct() {
        return product;
    }

    public void addProcduct(Produto products){
        product.add(products);
    }

    public void RemoveProcduct(Produto products){
        product.remove(products);
    }
    
    
}

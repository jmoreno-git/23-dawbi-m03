package products;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }
    
    /**
     * adds a product to the list
     * avoiding null products and products with existing code or null code.
     * @param product
     * @return 
     */
    public boolean addProduct(Product product) {
        boolean b = false;
        if ((product != null) && (product.getCode() != null)) {
            //TODO check that code does not exist
            b = products.add(product);
        }
        return b;
    }
    
    public boolean modifyProduct(Product current, Product product) {
        boolean b = false;
        int index = products.indexOf(current);
        products.set(index, product);
        return b;        
    }
    
    public boolean removeProduct(Product product) {
        return products.remove(product);
    }
    
    /**
     * searches a product with the given code
     * @param code the code to search
     * @return a product with given code or null if not found
     */
    public Product searchProductByCode(String code) {
        Product result = null;
        int index = products.indexOf(new Product(code));
        if (index >= 0) {
            result = products.get(index);
        }
        return result;
    }
    
    public List<Product> searchAllProducts() {
        return new ArrayList<>(products);
    }
    
    public List<Product> searchProductsWithLowStock(int stock) {
        List<Product> result = null;
        //TODO
        return result;
    }
    
    public void generateProducts() {
        products.clear();
        products.add(new Product("code01", "desc01", 11, 101));
        products.add(new Product("code02", "desc02", 12, 102));
        products.add(new Product("code03", "desc03", 13, 103));
        products.add(new Product("code04", "desc04", 14, 104));
        products.add(new Product("code05", "desc05", 15, 105));
        products.add(new Product("code06", "desc06", 16, 106));

    }
    
}

package products;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class StoreMain {

    private Store myStore;
    private Scanner scan;
    private boolean exit;
    
//    public StoreMain() {
//        myStore = new Store();
//        scan = new Scanner(System.in);
//    }
    
    public static void main(String[] args) {
        StoreMain sm = new StoreMain();
        sm.run();
    }

    private void run() {
        myStore = new Store();
        myStore.generateProducts();
        scan = new Scanner(System.in);
        //create menu
        Menu menu = createMenu();
        //control loop (user interaction)
        exit = false; //flag to exit program
        do {
            //show menu and get user's choice
            int option = menu.displayMenuAndGetOption();
            switch (option) {
                case 0:  //exit program
                    doExit();
                    break;
                case 1:  //search all products
                    doListAllProducts();
                    break;
                case 2:  //search product by code
                    doListProductByCode();
                    break;     
                case 3:  //search products with low stock
                    break;
                case 4:  //add a new product
                    doAddProduct();
                    break;
                case 5:  //modify a product
                    break;
                case 6:  //remove a product
                    doRemoveProduct();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (!exit);
    }  //end of run()

    private Menu createMenu() {
        Menu mnu = new Menu("Store application");
        mnu.addOption("Exit");
        mnu.addOption("Search all products");
        mnu.addOption("Search product by code");
        mnu.addOption("Search products with low stock");
        mnu.addOption("Add a new product");
        mnu.addOption("Modify a product");
        mnu.addOption("Remove a product");
        return mnu;
    }
    
    private void displayProductList(List<Product> data) {
        for (Product product : data) {
            System.out.println(product);
        }
        System.out.printf("%d products listed%n", data.size());
    }
    
    /**
     * asks for confirmation and exits application
     */
    private void doExit() {
        //TODO ask for confirmation
        exit = true;
    }

    /**
     * gets all products and displays all of them.
     */
    private void doListAllProducts() {
        List<Product> found = myStore.searchAllProducts();
        displayProductList(found);
    }

    /**
     * asks the user the code,
     * searches a product with that code,
     * if found, it displays the product,
     * if not found,it reports that to user.
     */
    private void doListProductByCode() {
        //ask the code
        String code = readString("Code: ");
        //search product
        Product found = myStore.searchProductByCode(code);
        if (found != null) {  //product found
            System.out.println(found);
        } else {  //product not found
            System.out.printf("Code '%s' not found%n", code);
        }
    }
    
    private String readString(String message) {
        System.out.print(message);
        return scan.next();
    }

    /**
     * reads from user data for the new product,
     * if correcty read, adds the product to the list,
     * and reports result to user.
     * If not correctly read, it reports error to user.
     */
    private void doAddProduct() {
        //read product
        Product prod = readProduct();
        if (prod != null) {
            boolean success = myStore.addProduct(prod);
            if (success) {
                System.out.println("Product successfully added");
            } else {
                System.out.println("Product not added");
            }
        } else {  //error reading
            System.out.println("Invalid data reading product");
        }
    }
    
    /**
     * reads from user data for a product
     * @return a product with entered data or null in case of error
     */
    private Product readProduct() {
        Product p = null;
        try {
            String code = readString("code: ");
            //TODO
            String sprice = readString("price: ");
            //TODO
            double price = Double.parseDouble(sprice);
            //TODO
            int stock = 0;
            //instantiate product
            p = new Product(code, sprice, price, stock);
        } catch (NumberFormatException ex) {
            p = null;
        }
        return p;
    }

    /**
     * asks the code of the product,
     * searches the product with that code,
     * displays product if found or reports error if not found
     * asks for confirmation and removes product.
     */
    private void doRemoveProduct() {
        //read code
        String code = readString("Code: ");
        Product prod = myStore.searchProductByCode(code);
        if (prod !=null) {
            System.out.println(prod);
            //ask for confirmation
            String answer = readString("Are you sure to remove? (yes/no): ");
            if (answer.equalsIgnoreCase("yes")) {
                boolean success = myStore.removeProduct(prod);
                if (success) {
                    System.out.println("Product successfully removed");
                } else {
                    System.out.println("Product not removed");
                }
            }
        } else {
            System.out.printf("Code '%s' not found%n", code);
        }
    }
    
}

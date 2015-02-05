package task1;

/**
 * Created by tzaxid on 05.02.15.
 */
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "shampoo", 32);
        Product p2 = new Product(2, "soap", 15);
        Product p3 = new Product(3, "toothpaste", 51);
        Store s1 = new Store(1, "KM Store");
        Store s2 = new Store(2, "BB Store");

        p1.show();
        System.out.println(p2.getId());
        System.out.println(p1.getPrice());
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.showProducts();
        System.out.println(s1.isProductPresent(p1));
        System.out.println(s1.isProductPresent(p2));
        s1.removeProduct(p2);
        s1.showProducts();
        p1.setName(" ");
        System.out.println("name" + p1.getName() + "name");
    }
}

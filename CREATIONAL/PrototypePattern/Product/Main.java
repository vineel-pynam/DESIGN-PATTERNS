public class Main {
    public static void main(String[] args) {
        ProductPrototype appleProduct = new Product("Apple", "120000");
        ProductPrototype samsungProduct = new Product("Samsung", "80000");

        ProductPrototype appleClone = appleProduct.clone();
        ProductPrototype samsungClone = samsungProduct.clone();

        
        System.out.println("Actual Product Display: ");
        appleProduct.display();
        samsungProduct.display();

        System.out.println("Cloned Product Display: ");
        appleClone.display();
        samsungClone.display();
    }
}

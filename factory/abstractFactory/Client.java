

public class Client {
    public static void main(String[] args) {
        ProductFactory factory1 = new ProdcutFactory1();
        ProductFactory factory2 = new ProductFactory2();
        ProductFactory factory3 = new ProductFactory3();

        ProductA productA=null;

        System.out.println(" utilisation de la premiere fabrique");
        productA = factory1.getProductA();
        productA.methodeA();

        System.out.println(" utilisation de la deuxieme fabrique");
        productA = factory2.getProductA();
        productA.methodeA();

      
        System.out.println(" utilisation de la troisieme fabrique");
        productA = factory3.getProductA();
        productA.methodeA();
    }

}

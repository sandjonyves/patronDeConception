package patron_de_creation.factory.methodFactory;
public class Client {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        ProductA productA = null;

        productA = productFactory.getProduct(ProductFactory.PRODUCT_A_1);
        productA.methodeA();

        productA = productFactory.getProduct(ProductFactory.PRODUCT_A_2);
        productA.methodeA();

        productA = productFactory.getProduct(ProductFactory.PRODUCT_A_3);
        productA.methodeA();
    }
}

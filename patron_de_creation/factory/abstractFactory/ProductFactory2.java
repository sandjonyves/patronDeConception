package patron_de_creation.factory.abstractFactory;


public class ProductFactory2 extends ProductFactory {

    private ProductA2 productA2;

    protected ProductA2 createProductA() {
        productA2 = new ProductA2();
        return productA2;
    }
    
}

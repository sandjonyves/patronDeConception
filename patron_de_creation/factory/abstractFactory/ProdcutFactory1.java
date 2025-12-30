package patron_de_creation.factory.abstractFactory;


public class ProdcutFactory1 extends ProductFactory {

    private ProductA1 productA1;

    protected ProductA1 createProductA() {
        productA1 = new ProductA1();
        return productA1;
    }

}

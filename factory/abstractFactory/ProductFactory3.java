

public class ProductFactory3 extends ProductFactory {

    private ProductA3 productA3;

    protected ProductA3 createProductA() {
        productA3 = new ProductA3();
        return productA3;
    }

}


public class ProductFactory {
    public static final int PRODUCT_A_1 = 1;
    public static final int PRODUCT_A_2 = 2;
    public static final int PRODUCT_A_3 = 3;

    public ProductA getProduct(int type) {
        switch (type) {
            case PRODUCT_A_1:
                return new ProductA1();
            case PRODUCT_A_2:
                return new ProductA2();
            case PRODUCT_A_3:
                return new ProductA3();
            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
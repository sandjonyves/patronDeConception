

public abstract class ProductFactory {

    protected abstract ProductA createProductA();

    public  ProductA getProductA(){
        return  createProductA();
    }

}

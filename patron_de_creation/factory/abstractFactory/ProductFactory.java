package patron_de_creation.factory.abstractFactory;


public abstract class ProductFactory {

    protected abstract ProductA createProductA();

    public  ProductA getProductA(){
        return  createProductA();
    }

}

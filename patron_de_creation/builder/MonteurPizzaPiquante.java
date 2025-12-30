package patron_de_creation.builder;

public class MonteurPizzaPiquante extends MonteurPizza {

    private Pizza pizza = new Pizza();

    @Override
    public void monterPate(){
        pizza.setPate("feuilletee");
    }

    @Override
    public void monterSauce(){
        pizza.setSauce("piquante");
    }

    @Override
    public void monterGarniture(){
        pizza.setGaniture("pepperoni + salami");
    };

    @Override
    public Pizza getPizza(){
        return pizza;
    }
}

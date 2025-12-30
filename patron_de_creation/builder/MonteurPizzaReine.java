package patron_de_creation.builder;


public class MonteurPizzaReine extends MonteurPizza {

    private Pizza pizza= new Pizza();

    @Override
    public void monterPate(){
        pizza.setPate("croisee");
    }

    @Override
    public void monterSauce(){
        pizza.setSauce("douce");
    }

    @Override
    public void monterGarniture(){
        pizza.setGaniture("jambon et champigon");
    }

    @Override
    public Pizza getPizza(){
        return pizza;
    }
}
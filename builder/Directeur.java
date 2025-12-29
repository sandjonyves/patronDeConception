public class Directeur {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza monteurPizza){
        this.monteurPizza = monteurPizza;
    }
    public Pizza construirePizza(){
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
        return monteurPizza.getPizza();
    }
}

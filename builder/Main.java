
public class Main {
    public static void main(String[] args) {

        Directeur directeur = new Directeur();

        MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();
        directeur.setMonteurPizza(monteurPizzaPiquante);
        Pizza pizzaPiquante = directeur.construirePizza();
        System.out.println("Pizza Piquante : " + pizzaPiquante.pate + " ; " + pizzaPiquante.sauce + " ; " + pizzaPiquante.ganiture);

        MonteurPizzaReine monteurPizzaReine = new MonteurPizzaReine();
        directeur.setMonteurPizza(monteurPizzaReine);
        Pizza pizzaReine = directeur.construirePizza();
        System.out.println("Pizza Reine : " + pizzaReine.pate + " ; " + pizzaReine.sauce + " ; " + pizzaReine.ganiture);
    }
    
}


public class Client {

    public static void main(String[] args) {
        IProduitFactory produitFactory = null;
        ProduitA produitA = null;
        ProduitB produitB = null;

        
        System.out.println("Utilisation de la première de la premiere fabrique");
        produitFactory = new ProduitFactory1();
        produitA = produitFactory.getProduitA();
        produitB = produitFactory.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        
        System.out.println("Utilisation de la deuxième fabrique");
        produitFactory = new ProduitFactory2();
        produitA = produitFactory.getProduitA();
        produitB = produitFactory.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

    }
    
}

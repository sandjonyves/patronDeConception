
public abstract class ProductA {
    public abstract void methodeA();
}


class ProductA1 extends ProductA {

    public void methodeA() {
        System.out.println("je suis un produit A1");
        System.out.println("ProductA1.methodeA()");
    }
}

class ProductA2 extends ProductA {
    public void methodeA() {
        System.out.println("je suis un produit A2");
        System.out.println("ProductA2.methodeA()");
    }
}

class ProductA3 extends ProductA {
    public void methodeA() {
        System.out.println("je suis un produit A3");
        System.out.println("ProductA3.methodeA()");
    }
}
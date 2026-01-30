public class ComposantPdf {

    public int pdfFixeContenu(String contenu) {
        System.out.println("Contenu PDF fixe : " + contenu);
        return 1;
    }

    public int pdfPrepareAffichage() {
        System.out.println("Preparation affichage PDF");
        return 1;
    }

    public int pdfRafraichir() {
        System.out.println("Rafraichissement PDF");
        return 1;
    }

    public int pdfTermineAffichage() {
        System.out.println("Fin affichage PDF");
        return 1;
    }

    public int pdfEnvoieImprimante() {
        System.out.println("Envoi PDF a l'imprimante");
        return 1;
    }
}

public class DocumentHtml implements Document {

    private String contenu;

    @Override
    public int setContenu(String contenu) {
        this.contenu = contenu;
        return 1;
    }

    @Override
    public int dessine() {
        System.out.println("Affichage HTML : " + contenu);
        return 1;
    }

    @Override
    public int imprime() {
        System.out.println("Impression HTML");
        return 1;
    }
}

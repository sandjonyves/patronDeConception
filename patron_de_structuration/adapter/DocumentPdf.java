public class DocumentPdf implements Document {

    private ComposantPdf outilPdf = new ComposantPdf();

    @Override
    public int setContenu(String contenu) {
        return outilPdf.pdfFixeContenu(contenu);
    }

    @Override
    public int dessine() {
        outilPdf.pdfPrepareAffichage();
        outilPdf.pdfRafraichir();
        return outilPdf.pdfTermineAffichage();
    }

    @Override
    public int imprime() {
        return outilPdf.pdfEnvoieImprimante();
    }
}

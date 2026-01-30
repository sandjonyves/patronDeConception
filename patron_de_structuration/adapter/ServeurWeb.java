public class ServeurWeb {

    public static void main(String[] args) {

        Document doc;

        
        doc = new DocumentHtml();
        doc.setContenu("Facture client HTML");
        doc.dessine();
        doc.imprime();

        System.out.println("------");

       
        doc = new DocumentPdf();
        doc.setContenu("Facture client PDF");
        doc.dessine();
        doc.imprime();
    }
}

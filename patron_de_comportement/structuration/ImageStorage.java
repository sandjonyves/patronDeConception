public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String image) {
        compressor.compress(image);
        filter.apply(image);
        System.out.println("Image sauvegardee avec succès : " + image);
    }
}

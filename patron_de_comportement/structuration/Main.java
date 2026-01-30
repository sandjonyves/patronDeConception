public class Main {

    public static void main(String[] args) {

      
        Compressor compressor = new JpegCompressor();
        Filter filter = new BlackAndWhiteFilter();

        ImageStorage storage = new ImageStorage(compressor, filter);
        storage.store("photo_profil.png");

        System.out.println("----- Changement de strategie -----");

        storage = new ImageStorage(
                new PngCompressor(),
                new HighContrastFilter()
        );
        storage.store("image_paysage.jpg");
    }
}

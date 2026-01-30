
public class JpegCompressor implements Compressor {
    
    @Override
    public void compress(String image) {
        System.out.println("Compressing " + image + " using JpwdCompressor");
    }
}

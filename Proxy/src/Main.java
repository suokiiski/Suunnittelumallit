import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Image> imageAlbum = new ArrayList<>();

        // Luo kuvat
        for (int i = 0; i < 6; i++) {
            imageAlbum.add(new ProxyImage("IMG_" + (i+1)));
        }

        // Näytä data
        for (Image image : imageAlbum) {
            image.showData();
        }

        // Lataa ja näytä kuvat
        for (Image image : imageAlbum) {
            image.displayImage();
        }

    }
}
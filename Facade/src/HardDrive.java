import java.util.Random;

public class HardDrive {

    private static final Random random = new Random();

    public char[] Read(long lba, int size) {
        char[] data = new char[size];

        for (int i = 0; i < size; i++) {
            data[i] = (char) ('A' + random.nextInt(26));
        }

        System.out.println("HardDrive read at lba " + lba + " with size " + size);
        return data;
    }

}
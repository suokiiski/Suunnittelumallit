public class Memory {

    public void Load(long position, char[] data) {
        if (data == null) {
            System.out.println("Error: No data to load.");
            return;
        }

        String dataString = new String(data);
        System.out.println("Memory loaded at position " + position + " with data " + dataString);
        }

}
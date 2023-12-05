public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Clock original = new Clock(11, 05);
        Clock clone = original.clone();

        System.out.println("Original: " + original.showTime());
        System.out.println("Clone: " + clone.showTime());

        original.setTime(15, 45);

        System.out.println("Original: " + original.showTime());
        System.out.println("Clone: " + clone.showTime());

        clone.setTime(20, 34);

        System.out.println("Original: " + original.showTime());
        System.out.println("Clone: " + clone.showTime());

    }

}
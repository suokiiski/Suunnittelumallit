public class CPU {

    public void Freeze() {
        System.out.println("CPU has freeze.");
    }

    public void Jump(long position) {
        System.out.println("CPU jumped to position " + position);
    }

    public void Execute() {
        System.out.println("Execute: CPU");
    }

}

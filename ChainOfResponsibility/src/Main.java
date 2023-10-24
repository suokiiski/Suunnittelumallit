public class Main {
    public static void main(String[] args) {

        Lahiesihenkilo lehenkilo = new Lahiesihenkilo();
        Paallikko pkko = new Paallikko();
        Toimitusjohtaja tj = new Toimitusjohtaja();

        lehenkilo.setSuccessor(pkko);
        pkko.setSuccessor(tj);

        Pyynto pyynto1 = new Pyynto(1.5);
        Pyynto pyynto2 = new Pyynto(2.5);
        Pyynto pyynto3 = new Pyynto(5.5);

        lehenkilo.processRequest(pyynto1);
        lehenkilo.processRequest(pyynto2);
        lehenkilo.processRequest(pyynto3);

    }
}
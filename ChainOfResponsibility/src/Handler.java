public abstract class Handler {

    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void processRequest(Pyynto pyynto) {
        if (successor != null) {
            successor.processRequest(pyynto);
        }
    }
}

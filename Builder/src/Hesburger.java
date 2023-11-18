public class Hesburger implements IHampurilainen {
    // Konkreettinen builder StringBuilderilla

    private StringBuilder burgeriS;

    @Override
    public void luoHampurilainen() {
        burgeriS = new StringBuilder();
    }

    @Override
    public void lisaaSampyla() {
        burgeriS.append("Hesburgerin sämpylä ");
    }

    @Override
    public void lisaaPihvi() {
        burgeriS.append("Hesburgerin pihvi ");
    }

    @Override
    public void lisaaJuusto() {
        burgeriS.append("Hesburgerin juusto ");
    }

    @Override
    public StringBuilder getHampurilainen() {
        return burgeriS;
    }

}

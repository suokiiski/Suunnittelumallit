public class Tyontekija {
    // Director
    private IHampurilainen iHamppari;

    public void setHampurilainen(IHampurilainen iH) {
        iHamppari = iH;
    }

    public void rakennaHamppari() {
        iHamppari.luoHampurilainen();
        iHamppari.lisaaSampyla();
        iHamppari.lisaaJuusto();
        iHamppari.lisaaPihvi();
        iHamppari.lisaaSampyla();
    }

}

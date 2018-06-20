package pl.alx.listaZadaniowaTrzy.zadaniePierwsze;

public class OgloszenieSamochodowe extends Ogloszenie {
    private String model;
    private String marka;
    private int rok;
    private int przebieg;
    private int moc;
    private String paliwo;


    public OgloszenieSamochodowe() {
        System.out.println("obiekt utworzony!");

    }

    public OgloszenieSamochodowe(String title, String description, Double price, String sellerName, String sellerStreetAddress, String sellerCityAddress, String sellerZipCode, String model, String marka, int rok, int przebieg, int moc, String paliwo) {
        super(title, description, price, sellerName, sellerStreetAddress, sellerCityAddress, sellerZipCode);
        this.setModel(model);
        this.setMarka(marka);
        this.setRok(rok);
        this.setPrzebieg(przebieg);
        this.setMoc(moc);
        this.setPaliwo(paliwo);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }


}

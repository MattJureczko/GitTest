package pl.alx.listaZadaniowaTrzy.zadaniePierwsze;

public class Ogloszenie {
    //object properties
    private String title;// = new String();
    private String description;// = new String();
    private Double price;// = new Double();
    //seller properties
    private String sellerName;// = new String();
    private String sellerStreetAddress;// = new String();
    private String sellerCityAddress;// = new String();
    private String sellerZipCode;// = new String();
    public Ogloszenie(String title, String description, Double price, String sellerName, String sellerStreetAddress, String sellerCityAddress, String sellerZipCode) {
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);
        this.setSellerName(sellerName);
        this.setSellerStreetAddress(sellerStreetAddress);
        this.setSellerCityAddress(sellerCityAddress);
        this.setSellerZipCode(sellerZipCode);
    }

    Ogloszenie () {
        System.out.println("Tworzenie obiektu klasy Ogloszenie");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerStreetAddress() {
        return sellerStreetAddress;
    }

    public void setSellerStreetAddress(String sellerStreetAddress) {
        this.sellerStreetAddress = sellerStreetAddress;
    }

    public String getSellerCityAddress() {
        return sellerCityAddress;
    }

    public void setSellerCityAddress(String sellerCityAddress) {
        this.sellerCityAddress = sellerCityAddress;
    }

    public String getSellerZipCode() {
        return sellerZipCode;
    }

    public void setSellerZipCode(String sellerZipCode) {
        this.sellerZipCode = sellerZipCode;
    }


}

package ch4.factoryPattern;

public class CDAdvanced implements ShoppingItem {

    private String cdId;
    private String cdTitle;
    private String cdProducer;

    static CDAdvanced getInstance(){
        return new CDAdvanced();
    }

    public CDAdvanced title(String cdTitle){
        this.cdTitle = cdTitle;
        return this;
    }

    public CDAdvanced producer(String cdProducer){
        this.cdProducer = cdProducer;
        return this;
    }

    public CDAdvanced id(String cdId){
        this.cdId = cdId;
        return this;
    }

    public String getCdId() {
        return cdId;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public String getCdProducer() {
        return cdProducer;
    }

    @Override
    public String toString() {
        return "CD{" +
                "cdId='" + cdId + '\'' +
                ", cdTitle='" + cdTitle + '\'' +
                ", cdProducer='" + cdProducer + '\'' +
                '}';
    }
}

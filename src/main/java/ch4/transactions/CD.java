package ch4.transactions;

public class CD implements ShoppingItem{

    private String cdId;
    private String cdTitle;
    private String cdProducer;

    public CD() {
    }

    public CD(String cdId, String cdTitle, String cdProducer) {
        this.cdId = cdId;
        this.cdTitle = cdTitle;
        this.cdProducer = cdProducer;
    }

    public String getCdId() {
        return cdId;
    }

    public void setCdId(String cdId) {
        this.cdId = cdId;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public void setCdTitle(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    public String getCdProducer() {
        return cdProducer;
    }

    public void setCdProducer(String cdProducer) {
        this.cdProducer = cdProducer;
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

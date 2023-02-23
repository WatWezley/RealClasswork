package chapterEight.Estore;

public class BillingInformation {

    CreditCardInformation information = new CreditCardInformation(0,null,null,null,null );
    Address address = new Address(null,null,0,null,null);

    private String receiversPhoneNumber;

    private String receiversName;

    public BillingInformation(String receiversPhoneNumber, String receiversName) {
        this.receiversPhoneNumber = receiversPhoneNumber;
        this.receiversName = receiversName;
    }

    public String getReceiversPhoneNumber() {
        return receiversPhoneNumber;
    }

    public void setReceiversPhoneNumber(String receiversPhoneNumber) {
        this.receiversPhoneNumber = receiversPhoneNumber;
    }

    public String getReceiversName() {
        return receiversName;
    }

    public void setReceiversName(String receiversName) {
        this.receiversName = receiversName;
    }
}

package chapterEight.Estore;

public class CreditCardInformation {

    private int cvv;

    private String cardExpiration;

    private String creditCardNumber;

    private String nameOnCard;

    private CardType cardType;

    public CreditCardInformation(int cvv,String cardExpiration,String creditCardNumber, String nameOnCard,CardType cardType){
        this.cvv=cvv;
        this.cardExpiration=cardExpiration;
        this.creditCardNumber=creditCardNumber;
        this.nameOnCard=nameOnCard;
        this.cardType=cardType;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}

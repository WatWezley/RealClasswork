package chapterEight.PhoneBook;

public class Contact {
    private String name;
    private String phoneNumber;

    private String mobileNumber;

    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String phoneNumber, String mobileNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        email = emailAddress;
    }


    @Override
    public String toString(){
        return String.format("""
                ***************************************************
                        CONTACT DETAILS
                ***************************************************
                NAME: %s
                PHONE NUMBER: %s
                MOBILE NUMBER:%s
                EMAIL:%s
                ***************************************************
                """,name, phoneNumber, mobileNumber,email);
    }

    public String getName() {
        return name;
    }
}

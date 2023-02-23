package tdd;

public class CarShop {

    private String model;
    private String year;
    private double price;
    private double discount;

    public CarShop(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(String model) {

        if (model == "Toyota") {;
            double discount = 0.05;
            this.discount = discount;
        }
        else if (model == "Benz") {
            double discount = 0.07;
            this.discount = discount;
        }
    }

    public double getDiscount(){
        return discount;
    }

    public double getDiscountedPrice(double discount){
        return (price - (discount * price));
    }
}



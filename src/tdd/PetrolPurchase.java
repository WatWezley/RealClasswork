package tdd;

public class PetrolPurchase {

        private String location;

        private String petrolType;

        private  int quantity;

        private double pricePerLitre;

        private double percentageDiscount;

        public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLitre, double percentageDiscount) {
            this.location = location;
            this.petrolType = petrolType;
            this.quantity = quantity;
            this.pricePerLitre = pricePerLitre;
            this.percentageDiscount = percentageDiscount;
        }


    public void setLocation(String location) {
            this.location = location;
        }

        public String getLocation() {
            return location;
        }

        public void setPetrolType(String petrolType) {
            this.petrolType = petrolType;
        }

        public String getPetrolType() {
            return petrolType;
        }

    public void setQuantity(int quantity) {
            this.quantity = quantity;
    }

    public int getQuantity(){
            return quantity;
    }

    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre(){
            return pricePerLitre;
    }


    public void setPercentageDiscount(double percentageDiscount) {
            this.percentageDiscount =percentageDiscount;
    }

    public double getPercentageDiscount(){
            return  (pricePerLitre*quantity* percentageDiscount);
    }

    public double getPriceAmount(){
        return (quantity*pricePerLitre)-(quantity*pricePerLitre * percentageDiscount);
    }

    public double getTotalCost(){
            return (pricePerLitre*quantity);
    }

}




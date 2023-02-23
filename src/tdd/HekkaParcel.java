package tdd;

public class HekkaParcel {

    private int parcelScanned;
    private int parcelDelivered;

    private double collectionRate;

    public HekkaParcel(int parcelScanned, int parcelDelivered) {
        this.parcelDelivered = parcelDelivered;
        this.parcelScanned = parcelScanned;
    }


    public void setParcelScanned(int parcelScanned) {
        if (parcelScanned > 0) {
            this.parcelScanned = parcelScanned;
        } else {
            this.parcelScanned = 0;
        }
    }


    public double getParcelScanned() {
        return parcelScanned;
    }


    public void setParcelDelivered(int parcelDelivered) {
        if (parcelDelivered > 0) {
            this.parcelDelivered = parcelDelivered;
        } else {
            this.parcelDelivered = 0;
        }
    }


    public int getParcelDelivered() {
        return parcelDelivered;
    }

    public double getCollectionRate(int parcelScanned, int parcelDelivered) {
        if (parcelScanned > 0 && parcelDelivered > 0) {
            return ((parcelDelivered*0.1) / parcelScanned) * 1000;
        } else {
            return  0;
        }
    }

    public double getBonus(double collectionRate) {
        if (collectionRate > 0.0 && collectionRate <= 49.0) {
            return (parcelDelivered * 0.0);
        } else if (collectionRate >= 50.0 && collectionRate <= 59.0) {
            return (parcelDelivered * 200);
        } else if (collectionRate >= 59.0 && collectionRate <= 69.0) {
            return (parcelDelivered * 250);
        }else {
            return (parcelDelivered * 500);
            }
        }

    }







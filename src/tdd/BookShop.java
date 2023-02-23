package tdd;

public class BookShop {


    public int totalPrice(int numberOfBooks) {
        if (numberOfBooks >= 1 && numberOfBooks <= 4) {
            return (2000 * numberOfBooks);
        } else if
        (numberOfBooks >= 5 && numberOfBooks <= 9) {
            return (1800 * numberOfBooks);
        }
        else if (numberOfBooks >= 10 && numberOfBooks <= 29) {
            return (1600 * numberOfBooks);
        }
        else if (numberOfBooks >= 30 && numberOfBooks <= 49) {
            return (1500 * numberOfBooks);
        }
        else if (numberOfBooks >= 50 && numberOfBooks <= 99) {
            return (1300 * numberOfBooks);
        }
        else if (numberOfBooks >= 100 && numberOfBooks <= 199) {
            return (1200 * numberOfBooks);
        }
        else if (numberOfBooks >= 200 && numberOfBooks <= 499) {
            return (1100 * numberOfBooks);
        }
        else if (numberOfBooks >= 500) {
            return (1000 * numberOfBooks);
        }
        return 0;

    }

}

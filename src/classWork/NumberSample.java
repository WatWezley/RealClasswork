package classWork;

public class NumberSample {
    private int numberA;

    private int numberB;

    private int numberC;

    private int numberD;

    private int numberE;

    public NumberSample(int numberA, int numberB, int numberC, int numberD, int numberE) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
        this.numberD = numberD;
        this.numberE = numberE;

    }

    public void setA(int numberA) {
        this.numberA = numberA;
    }

    public void setB(int numberB) {
        this.numberB = numberB;
    }

    public void setC(int numberC) {
        this.numberC = numberC;
    }

    public void setD(int numberD) {
        this.numberD = numberD;
    }

    public void setE(int numberE) {
        this.numberE = numberE;
    }


    public int listEvenNumber(int numberA, int numberB, int numberC, int numberD, int numberE) {
        if (numberA % 2 == 1) {
            return numberA;
        }
        if (numberB % 2 == 1) {
            return numberB;
        }
        if (numberC % 2 == 1) {
            return numberC;
        }
        if (numberD % 2 == 1) {
            return numberD;
        }
        if (numberE % 2 == 1) {
            return numberE;
        }
        return 0;
    }

    public int listOddNumber(int numberA, int numberB, int numberC, int numberD, int numberE) {
        if (numberA % 2 == 0) {
            return numberA;
        }
        if (numberB % 2 == 0) {
            return numberB;
        }
        if (numberC % 2 == 0) {
            return numberC;
        }
        if (numberD % 2 == 0) {
            return numberD;
        }
        if (numberE % 2 == 0) {
            return numberE;
        }
        return 0;
    }


    public int chooseOption(int option) {
        if (option == 1) {
            return listEvenNumber(numberA, numberB, numberC, numberD, numberE);
        } else {
            return listOddNumber(numberA, numberB, numberC, numberD, numberE);
        }

    }
}
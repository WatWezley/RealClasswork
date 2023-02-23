package tdd;

public class AirConditioner {


    private boolean setOn;

    private int temp;

    public void switchOn(boolean value, int degree) {
        setOn = true;


    }

    public boolean getSwitchOn() {
        return setOn;


    }

    public void defaultTemp(int degree) {
        int temp = degree;
    }

    public void switchoff(boolean value) {
        setOn = false;
    }

    public String increaseTemp(int changeTemp) {
        if (temp < changeTemp && changeTemp <= 30) {
            String temperature = "increase temperature";
            return temperature;
        } else {
            String maximumTemp = "30";
            return maximumTemp;
        }
    }


        public String decreaseTemp ( int changeTemp){
            if (temp < changeTemp && changeTemp >= 16) {
                String temperature = "decrease temperature";
                return temperature;
            } else {
                String minimumTemp = "30";
                return minimumTemp;

            }
        }
    }
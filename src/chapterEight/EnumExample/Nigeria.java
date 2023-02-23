package chapterEight.EnumExample;

public enum Nigeria {
    NORTHCENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger", "Plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba","Yobe"),
    NORTHWEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTHEAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTHSOUTH("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","River"),
    SOUTHWEST("Ekiti","Lagos","Osun","Ondo","Oyo");


    private String[] state = new String[10];

    Nigeria(String... state) {
        this.state = state;
    }

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }
}
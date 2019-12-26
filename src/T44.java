public enum T44 {
    Ronit("student", "14"),
    Tushar("collage", "21"),
    Chiranjivee("office", "24");

    private final String desc;
    private final String year;

    T44(String description, String birthday){
        desc = description;
        year = birthday;
    }
    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }
}

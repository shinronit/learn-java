public enum T45Practice {
    Ronit("student", "14"),
    Tushar("collage", "21"),
    Chiranjivee("office", "24"),
    cod("cod","1"),
    pubg("pubg","2"),
    coc("coc","6");

    private final String desc;
    private final String year;

    T45Practice(String description, String birthday){
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

public enum T45 {
    Ronit("student", "14"),
    Tushar("collage", "21"),
    Chiranjivee("office", "24"),
    PaganMin("King of KYRAT","31"),
    Nico("Gta4Character","23"),
    CJ("Gtasa","26");

    private final String desc;
    private final String year;

    T45(String description, String birthday){
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

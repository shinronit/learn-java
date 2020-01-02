public enum Custom26class {
    GTA5("TPP GAME", "2014"),
    GTA4("ROCKSTAR GAMES", "2008"),
    FARCRY4("FPS SHOOTER", "2014"),
    Rtx2080("graphics card","2019"),
    NubiaRedMagic("GAMING PHONE","2019"),
    ASUSROG("GAMING PHONE","2019");

    private final String desc;
    private final String year;

    Custom26class(String description, String birthday){
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

import java.io.*;

public class CJDataState implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String MAGGI_CARD_DESCRIPTION = "Requires 60 coins for 1 use";
    private static final String TEA_CARD = "Requires 30 coins for 1 use";
    private static final String TEA_TOAST_CARD = "Requires 100 coins for 1 use";
    private static final String ROOM_CLEAN_BOTTLE = "Requires 150 coins for 1 use";
    private static final String WATER_CARD = "Requires 60 coins for 1 use";
    private static final String MOVIES_DOWNLOADS_LEFT = "Requires 200 coins for 1 use";
    private static final String BOOKS_DOWNLOADS_LEFT = "Requires 120 coins for 1 use";
    private static final String APPS_DOWNLOADS_LEFT = "Requires 120 coins for 1 use";

    int totalCoins;
    int maggiCard;
    int teaCard;
    int teaToastCard;
    int roomCleanBottle;
    int waterCard;
    int movieDownload;
    int bookDownload;
    int appDownload;

    public int getTeaCard(){
        return teaCard;
    }

    public void setTeaCard(int teaCard){
        this.teaCard = teaCard;
    }

    public int getTotalCoins(){
        return totalCoins;
    }

    public void setTotalCoins(int totalCoins){
        this.totalCoins = totalCoins;
    }

    public int getMaggiCard(){
        return maggiCard;
    }

    public void setMaggiCard(int maggiCard){
        this.maggiCard = maggiCard;
    }

    public int getTeaToastCard(){
        return teaToastCard;
    }

    public void setTeaToastCard(int teaToastCard){
        this.teaToastCard = teaToastCard;
    }

    public int getRoomCleanBottle(){
        return roomCleanBottle;
    }

    public void setRoomCleanBottle(int roomCleanBottle){
        this.roomCleanBottle = roomCleanBottle;
    }

    public int getWaterCard(){
        return waterCard;
    }

    public void setWaterCard(int waterCard){
        this.waterCard = waterCard;
    }

    public int getMovieDownload(){
        return movieDownload;
    }

    public void setMovieDownload(int movieDownload){
        this.movieDownload = movieDownload;
    }

    public int getBookDownload(){
        return bookDownload;
    }

    public void setBookDownload(int bookDownload){
        this.bookDownload = bookDownload;
    }

    public int getAppDownload(){
        return appDownload;
    }

    public void setAppDownload(int appDownload){
        this.appDownload = appDownload;
    }

    public static void WriteObjectToFile(Object serObj) {

        try {
            FileOutputStream fileOut = new FileOutputStream("cj.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static CJDataState readObjectFromFile(String filepath) {

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();
            return (CJDataState) obj;

        }
        catch (FileNotFoundException exx) {
            return new CJDataState();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return new CJDataState();
        }
    }

    public void display() {
        System.out.println("Your account information:");
        System.out.format("%-32s%-30s%-40s\n", "Type of Card: ", "Quantity", "Shop");
        System.out.format("=========================================================================================\n");
        System.out.format("%-32s%-30d%-40s\n", "Total coins: ", this.totalCoins,"");
        System.out.format("%-32s%-30d%-40s\n", "Total Maggi Cards: ", this.maggiCard, MAGGI_CARD_DESCRIPTION);
        System.out.format("%-32s%-30d%-40s\n", "Tea Card: ", this.teaCard, TEA_CARD);
        System.out.format("%-32s%-30d%-40s\n", "TeaToast Card: ", this.teaToastCard , TEA_TOAST_CARD);
        System.out.format("%-32s%-30d%-40s\n", "RoomBottleCleanCard: ", this.roomCleanBottle,ROOM_CLEAN_BOTTLE);
        System.out.format("%-32s%-30d%-40s\n", "Water Card: ", this.waterCard,WATER_CARD);
        System.out.format("%-32s%-30d%-40s\n", "MoviesCard: ", this.movieDownload,MOVIES_DOWNLOADS_LEFT);
        System.out.format("%-32s%-30d%-40s\n", "Games/AppsCards: ", this.appDownload,APPS_DOWNLOADS_LEFT);
        System.out.format("%-32s%-30d%-40s\n", "Books Card: ", this.bookDownload,BOOKS_DOWNLOADS_LEFT);
    }
}

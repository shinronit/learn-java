import java.util.Random;
import java.util.Scanner;

public class cjAccountOpenMain {
    public void openCjAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type commands to get command list.");
        getMd5 onegetMd5 = new getMd5();
        modifyCJData modifyCJData = new modifyCJData();
        CJDataState dataState = CJDataState.readObjectFromFile("cj.txt");
        dataState.display();
        String input = scanner.nextLine();
        Random random = new Random();
        int randomOne = 10000+random.nextInt(9999999);


        if (input.equalsIgnoreCase("update")) {
            System.out.println("Enter Admin Password to Modify Data");
            String adminPassword = scanner.nextLine();
            String pcheck = onegetMd5.getMd5(adminPassword);
            if (pcheck.equals("10b4bf9b131a6589181cd876668a05df")) {//shincochan@
            }else{
                System.out.println("Wrong Password");
                System.out.println(pcheck);
                System.exit(0);
            }
            System.out.println("Enter new card name");
            String cardName = scanner.nextLine();
            if (cardName.equalsIgnoreCase("Coins")) {
                int newValue = scanner.nextInt();
                dataState.setTotalCoins(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Total Coin updated successfully");
                System.out.println("Coins added");
            }else if (cardName.equalsIgnoreCase("Maggi")) {
                int newValue = scanner.nextInt();
                dataState.setMaggiCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Maggi Cards updated successfully");
            }else if (cardName.equalsIgnoreCase("Tea")) {
                int newValue = scanner.nextInt();
                dataState.setTeaCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Tea cards updated successfully");
            }else if (cardName.equalsIgnoreCase("TeaToast")) {
                int newValue = scanner.nextInt();
                dataState.setTeaToastCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Tea Toast Card updated successfully");
            }else if (cardName.equalsIgnoreCase("Room Clean")) {
                int newValue = scanner.nextInt();
                dataState.setRoomCleanBottle(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Room clean bottles updated successfully");
            }else if (cardName.equalsIgnoreCase("Water")) {
                int newValue = scanner.nextInt();
                dataState.setWaterCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Water Card updated successfully");
            }else if (cardName.equalsIgnoreCase("Movie")) {
                int newValue = scanner.nextInt();
                dataState.setMovieDownload(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Movie Card updated successfully");
            }else if (cardName.equalsIgnoreCase("App")) {
                int newValue = scanner.nextInt();
                dataState.setAppDownload(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("App Cards updated successfully");
            }else if (cardName.equalsIgnoreCase("Book")) {
                int newValue = scanner.nextInt();
                dataState.setBookDownload(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Book Cards updated successfully");
            }
        }else if (input.equalsIgnoreCase("quit")) {
            System.out.println("Thank you for visiting.");
            System.exit(0);
        }else if (input.equalsIgnoreCase("deleteaccount")) {
            System.out.println("Please contact admins");
        }else if (input.equalsIgnoreCase("buy")) {
            System.out.println("Enter card name or card number maggi card is number 1 and books is number 8");
            String cardName = scanner.nextLine();
            if (cardName.equalsIgnoreCase("Maggi") || cardName.equalsIgnoreCase("1")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 60;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setMaggiCard(dataState.getMaggiCard()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("Tea") || cardName.equalsIgnoreCase("2")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 30;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setTeaCard(dataState.getTeaCard()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("TeaToast") || cardName.equalsIgnoreCase("3")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 100;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setTeaToastCard(dataState.getTeaToastCard()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("Room Bottle") || cardName.equalsIgnoreCase("4")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 150;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setRoomCleanBottle(dataState.getRoomCleanBottle()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("Water") || cardName.equalsIgnoreCase("5")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 60;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setWaterCard(dataState.getWaterCard()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("Movie") || cardName.equalsIgnoreCase("6")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 200;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setMovieDownload(dataState.getMovieDownload()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("App") || cardName.equalsIgnoreCase("7")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 120;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setAppDownload(dataState.getAppDownload()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }else if (cardName.equalsIgnoreCase("Books") || cardName.equalsIgnoreCase("8")) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                int price = quantity * 120;
                if (dataState.getTotalCoins() >= price) {
                    dataState.setTotalCoins(dataState.getTotalCoins()-price);
                    dataState.setBookDownload(dataState.getBookDownload()+quantity);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Purchase successful.");
                }else{
                    System.out.println("Not enough coins.");
                }
            }
            System.out.println("Thank you for visiting.");
            System.out.println("Please take a screenshot of your purchase for future reference");
        }else if (input.equalsIgnoreCase("commands")) {
            System.out.println("buy,update,deleteaccount,quit");
            System.out.println("Please rerun app");
            System.exit(0);
        }else if (input.equalsIgnoreCase("use")) {
            System.out.println("Which Card do u want to use.");
            String use = scanner.nextLine();
            if (use.equalsIgnoreCase("Maggi") || use.equalsIgnoreCase("1")) {
                if (dataState.getMaggiCard() > 0) {
                    dataState.setMaggiCard(dataState.getMaggiCard()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }else if (use.equalsIgnoreCase("Tea") || use.equalsIgnoreCase("2")) {
                if (dataState.getTeaCard() > 0) {
                    dataState.setTeaCard(dataState.getTeaCard()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }
            else if (use.equalsIgnoreCase("TeaToastCard") || use.equalsIgnoreCase("3")) {
                if (dataState.getTeaToastCard() > 0) {
                    dataState.setTeaToastCard(dataState.getTeaToastCard()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }else if (use.equalsIgnoreCase("roombottlecard") || use.equalsIgnoreCase("4")) {
                if (dataState.getRoomCleanBottle() > 0) {
                    dataState.setRoomCleanBottle(dataState.getRoomCleanBottle()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }
            else if (use.equalsIgnoreCase("water") || use.equalsIgnoreCase("5")) {
                if (dataState.getWaterCard() > 0) {
                    dataState.setWaterCard(dataState.getWaterCard()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }
            else if (use.equalsIgnoreCase("movie") || use.equalsIgnoreCase("6")) {
                if (dataState.getMovieDownload() > 0) {
                    dataState.setMovieDownload(dataState.getMovieDownload()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }
            else if (use.equalsIgnoreCase("app") || use.equalsIgnoreCase("7")) {
                if (dataState.getAppDownload() > 0) {
                    dataState.setAppDownload(dataState.getAppDownload()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }
            else if (use.equalsIgnoreCase("book") || use.equalsIgnoreCase("8")) {
                if (dataState.getBookDownload() > 0) {
                    dataState.setBookDownload(dataState.getBookDownload()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    System.out.println("Use successful. Order ID : "+randomOne);
                    System.out.println("Please note down the order id for a future reference");
                }else{
                    System.out.println("Not enough cards.");
                }
            }
        }
    }
}

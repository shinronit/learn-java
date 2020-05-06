import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class cjAccountOpenMain {
    public void openCjAccount(){
        Scanner scanner = new Scanner(System.in);
        getMd5 onegetMd5 = new getMd5();
        modifyCJData modifyCJData = new modifyCJData();
        CJDataState dataState = CJDataState.readObjectFromFile("cj.txt");
        dataState.display();

        Random random = new Random();
        int randomOne = 10000+random.nextInt(9999999);

        userInput(scanner , onegetMd5 , dataState , random);

    }
    public static void updateCJCardAdmin(Scanner scanner , getMd5 onegetMd5 , CJDataState dataState){
        System.out.println("Enter Admin Password to Modify Data");
        String adminPassword = scanner.nextLine();
        String pcheck = onegetMd5.getMd5(adminPassword);
        if(pcheck.equals("10b4bf9b131a6589181cd876668a05df")) {//shincochan@
        }else{
            System.out.println("Wrong Password");
            System.out.println(pcheck);
            System.exit(0);
        }
        for (;;) {
            System.out.println("Enter new card name");
            String cardName = scanner.nextLine();
            if(cardName.equalsIgnoreCase("Coins")) {
                int newValue = scanner.nextInt();
                dataState.setTotalCoins(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Total Coin updated successfully");
                System.out.println("Coins added");
            }else if(cardName.equalsIgnoreCase("Maggi")) {
                int newValue = scanner.nextInt();
                dataState.setMaggiCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Maggi Cards updated successfully");
            }else if(cardName.equalsIgnoreCase("Tea")) {
                int newValue = scanner.nextInt();
                dataState.setTeaCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Tea cards updated successfully");
            }else if(cardName.equalsIgnoreCase("TeaToast")) {
                int newValue = scanner.nextInt();
                dataState.setTeaToastCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Tea Toast Card updated successfully");
            }else if(cardName.equalsIgnoreCase("RoomClean")) {
                int newValue = scanner.nextInt();
                dataState.setRoomCleanBottle(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Room clean bottles updated successfully");
            }else if(cardName.equalsIgnoreCase("Water")) {
                int newValue = scanner.nextInt();
                dataState.setWaterCard(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Water Card updated successfully");
            }else if(cardName.equalsIgnoreCase("Movie")) {
                int newValue = scanner.nextInt();
                dataState.setMovieDownload(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Movie Card updated successfully");
            }else if(cardName.equalsIgnoreCase("App")) {
                int newValue = scanner.nextInt();
                dataState.setAppDownload(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("App Cards updated successfully");
            }else if(cardName.equalsIgnoreCase("Book")) {
                int newValue = scanner.nextInt();
                dataState.setBookDownload(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Book Cards updated successfully");
            }else if(cardName.equalsIgnoreCase("spin")) {
                int newValue = scanner.nextInt();
                dataState.setSpins(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Spins updated successfully");
            }else if(cardName.equalsIgnoreCase("ratingrewards")) {
                int newValue = scanner.nextInt();
                dataState.setRatingRewards(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Rating Rewards updated successfully");
            }else if(cardName.equalsIgnoreCase("dailyrewards")) {
                int newValue = scanner.nextInt();
                dataState.setDailyRewards(newValue);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Daily Rewards updated successfully");
            }else if(cardName.equalsIgnoreCase("quit")) {
                System.out.println("Exited with no erros");
                System.exit(0);
            }
        }
    }
    public static void cjCardsBuy(Scanner scanner , CJDataState dataState){
        System.out.println("Enter card name or card number maggi card is number 1 and books is number 8");
        String cardName = scanner.nextLine();
        if(cardName.equalsIgnoreCase("Maggi") || cardName.equalsIgnoreCase("1")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 60;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setMaggiCard(dataState.getMaggiCard()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("Tea") || cardName.equalsIgnoreCase("2")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 30;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setTeaCard(dataState.getTeaCard()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("TeaToast") || cardName.equalsIgnoreCase("3")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 100;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setTeaToastCard(dataState.getTeaToastCard()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("RoomClean") || cardName.equalsIgnoreCase("4")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 150;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setRoomCleanBottle(dataState.getRoomCleanBottle()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("Water") || cardName.equalsIgnoreCase("5")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 30;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setWaterCard(dataState.getWaterCard()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("Movie") || cardName.equalsIgnoreCase("6")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 200;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setMovieDownload(dataState.getMovieDownload()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("App") || cardName.equalsIgnoreCase("7")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 120;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setAppDownload(dataState.getAppDownload()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("Book") || cardName.equalsIgnoreCase("8")) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            int price = quantity * 120;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setBookDownload(dataState.getBookDownload()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
            }else{
                System.out.println("Not enough coins.");
            }
        }else if(cardName.equalsIgnoreCase("RobotLevel") || cardName.equalsIgnoreCase("12")) {
            System.out.println("Every upgrade costs 150 Coins.");
            System.out.println("Enter level to increase :");
            int quantity = scanner.nextInt();
            int price = quantity * 150;
            if(dataState.getTotalCoins() >= price) {
                dataState.setTotalCoins(dataState.getTotalCoins()-price);
                dataState.setRobotLevel(dataState.getRobotLevel()+quantity);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Purchase successful.");
                if(dataState.getRobotLevel() == 1) {
                    System.out.println("Now your robot can peel vegetables like garlic cut onion ");
                }
            }else{
                System.out.println("Not enough coins.");
            }
        }
        System.out.println("Thank you for visiting.");
        System.out.println("Please take a screenshot of your purchase for future reference");
        System.out.println("NOTE : Only do this if your purchase was successful else ignore.");
    }
    public static void cjCardsUse(Scanner scanner , CJDataState dataState , Random random){
        int randomOne = 10000+random.nextInt(9999999);
        System.out.println("Which Card do u want to use : MAGGI, TEA, TEATOAST, ROOMCLEAN, WATER, MOVIE, APP, BOOK, SPIN ,RATINGREWARDS. Or use card NUMBER.");
        String use = scanner.nextLine();
        if(use.equalsIgnoreCase("Maggi") || use.equalsIgnoreCase("1")) {
            if(dataState.getMaggiCard() > 0) {
                dataState.setMaggiCard(dataState.getMaggiCard()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("Tea") || use.equalsIgnoreCase("2")) {
            if(dataState.getTeaCard() > 0) {
                dataState.setTeaCard(dataState.getTeaCard()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("TeaToast") || use.equalsIgnoreCase("3")) {
            if(dataState.getTeaToastCard() > 0) {
                dataState.setTeaToastCard(dataState.getTeaToastCard()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("roomclean") || use.equalsIgnoreCase("4")) {
            if(dataState.getRoomCleanBottle() > 0) {
                dataState.setRoomCleanBottle(dataState.getRoomCleanBottle()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("water") || use.equalsIgnoreCase("5")) {
            if(dataState.getWaterCard() > 0) {
                dataState.setWaterCard(dataState.getWaterCard()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("movie") || use.equalsIgnoreCase("6")) {
            if(dataState.getMovieDownload() > 0) {
                dataState.setMovieDownload(dataState.getMovieDownload()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("app") || use.equalsIgnoreCase("7")) {
            if(dataState.getAppDownload() > 0) {
                dataState.setAppDownload(dataState.getAppDownload()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("book") || use.equalsIgnoreCase("8")) {
            if(dataState.getBookDownload() > 0) {
                dataState.setBookDownload(dataState.getBookDownload()-1);
                CJDataState.WriteObjectToFile(dataState);
                dataState = CJDataState.readObjectFromFile("cj.txt");
                System.out.println("Use successful. Order ID : "+randomOne);
                System.out.println("Please note down the order id for a future reference");
                order(scanner , randomOne , use);
            }else{
                System.out.println("Not enough cards.");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("spin") || use.equalsIgnoreCase("9")) {
            System.out.println("Welcome to daily spin press enter to claim your reward, Win upto 1000 coins.");
            int dailySpins = random.nextInt(80);
            String claim = scanner.nextLine();
            if(claim.equalsIgnoreCase("")) {
                if(dataState.getSpins() > 0) {
                    dataState.setTotalCoins(dataState.getTotalCoins()+dailySpins);
                    System.out.println("Rewarded coins : "+dailySpins);
                    dataState.setSpins(dataState.getSpins()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    coinsUpdateNoticeAndOtherItems(scanner , randomOne , dailySpins , use);
                    System.exit(0);
                }else{
                    System.out.println("Not enough spins");
                    System.exit(0);
                }
            }else{
                System.out.println("This command is not accepted .");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("ratingrewards") || use.equalsIgnoreCase("10")) {
            System.out.println("Welcome to rating rewards press enter to claim your reward.");
            int ratingRewards = random.nextInt(10);
            String claim = scanner.nextLine();
            if(claim.equalsIgnoreCase("")) {
                if(dataState.getRatingRewards() > 0) {
                    dataState.setTotalCoins(dataState.getTotalCoins()+ratingRewards);
                    System.out.println("Rewarded coins : "+ratingRewards);
                    dataState.setRatingRewards(dataState.getRatingRewards()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    coinsUpdateNoticeAndOtherItems(scanner , randomOne , ratingRewards , use);
                    System.exit(0);
                }else{
                    System.out.println("Not enough rating points");
                    System.exit(0);
                }
            }else{
                System.out.println("This command is not accepted .");
                System.exit(0);
            }
        }else if(use.equalsIgnoreCase("dailyRewards") || use.equalsIgnoreCase("11")) {
            System.out.println("Welcome to daily rewards press enter to claim your reward.");
            int dailyRewards = random.nextInt(10);
            String claim = scanner.nextLine();
            if(claim.equalsIgnoreCase("")) {
                if(dataState.getDailyRewards() > 0) {
                    dataState.setTotalCoins(dataState.getTotalCoins()+dailyRewards);
                    System.out.println("Rewarded coins : "+dailyRewards);
                    dataState.setDailyRewards(dataState.getDailyRewards()-1);
                    CJDataState.WriteObjectToFile(dataState);
                    dataState = CJDataState.readObjectFromFile("cj.txt");
                    coinsUpdateNoticeAndOtherItems(scanner , randomOne , dailyRewards , use);
                    System.exit(0);
                }else{
                    System.out.println("Not enough dailyRewards points");
                    System.exit(0);
                }
            }else{
                System.out.println("This command is not accepted .");
                System.exit(0);
            }
        }else{
            System.exit(0);
        }
    }
    public static void commands(){
        System.out.println("BASIC COMMANDS : BUY, UPDATE, DELETEACCOUNT, ORDER-HISTORY ,QUIT .");
        System.out.println("CARD COMMANDS : MAGGI, TEA, TEATOAST, ROOMCLEAN, WATER, MOVIE, APP, BOOK, SPIN ,RATINGREWARDS.");
        System.out.println("Please write word with no spaces.('Example : water or WATER.')");
        System.out.println("Rerun app.");
        System.exit(0);
    }
    public static void gameZone(Scanner scanner , Random random , CJDataState dataState){
        System.out.println("Welcome to game zone");
        System.out.println("Choose games to play : Match the Number Wins , More games added soon.");
        System.out.println();
        System.out.println("Playing cost is 100 coins. Want to Play? Y/N" + "Choose N if you have cards.");
        String input = scanner.next();
        if(input.equalsIgnoreCase("y")) {
            dataState.setTotalCoins(dataState.getTotalCoins()-100);
            CJDataState.WriteObjectToFile(dataState);
            matchTheNumberWins(scanner , random , dataState);
        }else if(input.equalsIgnoreCase("N")) {
            if(dataState.getGamesLeft()>0){
                matchTheNumberWins(scanner , random , dataState);
            }else {
                System.out.println("Not enough cards .");
                System.exit(0);
            }
        }else{
            System.out.println("Error with that");
        }

    }
    public static void userInput(Scanner scanner , getMd5 onegetMd5 , CJDataState dataState , Random random){
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("update")) {
            updateCJCardAdmin(scanner , onegetMd5 , dataState);
        }else if(input.equalsIgnoreCase("quit")) {
            System.out.println("Thank you for visiting.");
            System.exit(0);
        }else if(input.equalsIgnoreCase("deleteaccount")) {
            System.out.println("Please contact admins");
        }else if(input.equalsIgnoreCase("buy")) {
            cjCardsBuy(scanner , dataState);
        }else if(input.equalsIgnoreCase("commands")) {
            commands();
        }else if(input.equalsIgnoreCase("use")) {
            cjCardsUse(scanner , dataState , random);
        }else if(input.equalsIgnoreCase("order-history")) {
            try{
                File myObj = new File("orderid.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }catch ( FileNotFoundException e ){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }else if(input.equalsIgnoreCase("terms-conditions")) {
            try{
                File myObj = new File("privacypolicytc.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }catch ( FileNotFoundException e ){
                System.out.println("An error occurred.");

            }
        }else if(input.equalsIgnoreCase("Games")) {
            gameZone(scanner , random , dataState);
        }else{
            System.out.println("There is no command like : "+input+" Plesae try again.");
        }
    }
    public static void order(Scanner scanner , int randomOne , String use){
        try{
            FileWriter myWriter = new FileWriter("orderid.txt" , true);
            System.out.println("Describe it in one line by giving spaces.");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            myWriter.write("Ordered on : "+formatter.format(date)+" . ");
            System.out.println("Please describe your full order.Like if you order toast describe number of toasts and tea.");
            System.out.println("Or if u order some room service please instruct what to not do. If there is no please leave this line.");
            String order = scanner.nextLine();
            myWriter.write("Description : "+order);
            myWriter.write("Your Order ID is "+randomOne+",You Ordered : "+use);
            String newLine = System.getProperty("line.separator");
            myWriter.write(newLine);
            myWriter.close();

        }catch ( IOException e ){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void coinsUpdateNoticeAndOtherItems(Scanner scanner , int randomOne , int random , String use){
        try{
            FileWriter myWriter = new FileWriter("orderid.txt" , true);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            myWriter.write("Ordered on : "+formatter.format(date)+" . ");
            myWriter.write("Awarded coins : "+random+" ");
            myWriter.write("Your Order ID is "+randomOne+",From : "+use);
            String newLine = System.getProperty("line.separator");
            myWriter.write(newLine);
            myWriter.close();

        }catch ( IOException e ){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void matchTheNumberWins(Scanner scanner , Random random , CJDataState dataState){
        int i = random.nextInt(10);
        int awardedCoins = 0;
        System.out.println("If your answer is correct you can get upto 500 coins.");
        System.out.println("Choose your number . (1-9)");
        System.out.print("Your Choice : ");
        String input = scanner.next();
        int inputcheck = Integer.parseInt(input);
        if(inputcheck == i) {
            awardedCoins += 200;
            dataState.setTotalCoins(dataState.getTotalCoins()+awardedCoins);
            CJDataState.WriteObjectToFile(dataState);
            dataState = CJDataState.readObjectFromFile("cj.txt");
            System.out.println("Coins Awarded.");
            System.out.println("100 coins were cut for playing so you received 100 more.");
        }else{
            System.out.println("You lost the number was : "+i);
        }
    }
}
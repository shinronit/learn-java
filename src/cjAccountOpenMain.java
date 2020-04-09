import java.util.Scanner;

public class cjAccountOpenMain {
    public void openCjAccount(){
        Scanner scanner = new Scanner(System.in);
        getMd5 onegetMd5 = new getMd5();
        cjAccountRead cjAccountRead = new cjAccountRead();
        modifyCJData modifyCJData = new modifyCJData();
        cjAccountRead.readFile();
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("update")) {
            modifyCJData.modifyFile("cjData.txt" , scanner , onegetMd5);
            System.out.println("done");
        }else if (input.equalsIgnoreCase("quit")){
            System.out.println("Thank you for visiting.");
            System.exit(0);
        }else if (input.equalsIgnoreCase("deleteaccount")){
            System.out.println("Please contact admins");
        }

    }
}

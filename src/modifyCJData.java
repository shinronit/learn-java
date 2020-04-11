package ciAccountFiles;

import ciAccountFiles.getMd5;

import java.io.*;
import java.util.Scanner;

public class modifyCJData {
    public void modifyFile(String filePath , Scanner scanner, getMd5 onegetMd5){
        File fileToBeModified = new File(filePath);
        System.out.println("Enter Admin Password to Modify Data");
        String adminPassword = scanner.nextLine();
        String pcheck = onegetMd5.getMd5(adminPassword);
        if ( pcheck.equals("6a0a6198ff0f659f5eb4dff3a8f6afbf")) {
            System.out.println("Enter old data");
            String oldString = scanner.nextLine();
            System.out.println("Enter new data");
            String newString = scanner.nextLine();
            String oldContent = "";
            BufferedReader reader = null;
            FileWriter writer = null;
            try{
                reader = new BufferedReader(new FileReader(fileToBeModified));
                String line = reader.readLine();
                while (line != null){
                    oldContent = oldContent+line+System.lineSeparator();
                    line = reader.readLine();
                }
                String newContent = oldContent.replaceAll(oldString , newString);
                writer = new FileWriter(fileToBeModified);
                writer.write(newContent);
            }catch (IOException e){
                e.printStackTrace();
            }finally{
                try{
                    reader.close();

                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }else {
            System.out.println("Wrong Password");
            System.out.println(pcheck);
            System.exit(0);
            System.out.println(pcheck);
        }
    }
}

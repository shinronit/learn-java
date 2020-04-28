import me.shib.java.lib.diction.DictionWord;
import sun.security.provider.MD5;

import javax.jws.WebService;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
import java.awt.Desktop;


public class Custom163 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get complete details about your word.");
        Random random = new Random();
        getMd5 getMd5 = new getMd5();
        System.out.print("Enter word : ");
        String firstInput = scanner.next();
        try{
            int numberCheck = Integer.parseInt(firstInput);
            System.out.println("Do not enter a number or symbol");
            System.out.println("Process finished with exit code 0");
            System.exit(0);
        }catch (Exception e ){

        }
        System.out.println("Your word was : " + firstInput);
        System.out.println("Your word contains " + firstInput.length() + " letters");
        System.out.println("Your word hashcode is : " + firstInput.hashCode());
        System.out.println("MD5 hash for ur word is : " + getMd5.getMd5(firstInput));
        System.out.println("Your word does not starts with a number.");

            try {
                sendGET("https://wordsapiv1.p.mashape.com/words/" + firstInput + " /definitions");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }


    private static void sendGET(String getURL) throws IOException {
        URL obj = new URL(getURL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
    }
}

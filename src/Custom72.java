import java.util.Scanner;

public class Custom72 {
    public static void main (String [] args){
        System.out.println("Microsoft Windows [Version 10.0.18363.592]\n" +
                "(c) 2019 Microsoft Corporation. All rights reserved.\n");
        System.out.print("C:\\Users\\Tushar Thakur\\IdeaProjects\\CuckooLearnsJava>");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("warning: CRLF will be replaced by LF in src/Custom71.java.\n" +
                "The file will have its original line endings in your working directory");
        if (input.equals("Custom72.java")){
            System.out.print("C:\\Users\\Tushar Thakur\\IdeaProjects\\CuckooLearnsJava>git commit -m  ");
            String input2 = scanner.next();
            System.out.println("[master b446918]\n" + input2 +
                    " 1 file changed, 9 insertions(+)\n" +
                    " create mode 100644 src/Custom71.java");
            System.out.print("C:\\Users\\Tushar Thakur\\IdeaProjects\\CuckooLearnsJava>");
            String input3 = scanner.next();
                System.out.println("Enumerating objects: 6, done.\n" +
                        "Counting objects: 100% (6/6), done.\n" +
                        "Delta compression using up to 4 threads\n" +
                        "Compressing objects: 100% (4/4), done.\n" +
                        "Writing objects: 100% (4/4), 493 bytes | 493.00 KiB/s, done.\n" +
                        "Total 4 (delta 2), reused 0 (delta 0)\n" +
                        "remote: Resolving deltas: 100% (2/2), completed with 2 local objects.\n" +
                        "To https://github.com/shinronit/learn-java.git");
        }else{
            System.out.println("File not found Error Code 212");
        }
    }
}





























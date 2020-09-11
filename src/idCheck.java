public class idCheck {
    public static void main(String[] args) {
        idCheck("user",12);
    }

    public static void idCheck(String name , int idNum){
        if(name.equalsIgnoreCase("user")){
            System.out.println("Welcome");
        }else{
            System.out.println("Name is not recognized");
        }
        if(idNum==12){
            System.out.println("ID match ");
        }else
        {
            System.out.println("ID is fake");
        }
    }
}

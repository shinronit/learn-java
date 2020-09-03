public class theSwitchStatement {
    public static void main(String[] args) {
        int value = 1;
        if(value==1){
            System.out.println("Value was 1");
        }else if(value==2){
            System.out.println("Value was 2 ");
        }else{
            System.out.println("Was not 1 or 2");
        }

        int switchvalue = 3;
        switch (switchvalue){
            case 1:
                System.out.println("value was 1 ");
                break;//break must be used after each case
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5 ");
                System.out.println("Actually it was "+ switchvalue);
                break;
            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5 ");
                break;
        }

        char switchchar = 'A';
        switch (switchchar){
            case 'A':
                System.out.println("A was typed");
                break;
            case 'B':
                System.out.println("B was typed");
                break;
            case 'C':
                System.out.println("C was typed");
                break;
            case 'D':
                System.out.println("D was typed");
                break;
            case 'E':
                System.out.println("E was typed");
                break;
            default:
                System.out.println("A , B , C , D , E were not typed");
        }
        String month = "JANUARY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("jun");
                break;
            default:
                System.out.println("Not sure");
        }




    }
}

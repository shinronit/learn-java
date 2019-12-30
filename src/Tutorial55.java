public class Tutorial55 {
    public static void main (String[]args){

        T55food bucky[]=new T55food[2];
        bucky[0]= new T55potpie();
        bucky[1]=new T55();

        for(int x = 0; x<2; x++){
            bucky[x].eat();
        }
    }
}

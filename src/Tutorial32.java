public class Tutorial32 {
    public static void main (String[] args){
        int nab[]={3,4,5,6,7};
        change(nab);


        for(int y:nab)
            System.out.println(y);
    }
    public static void change(int x[]){
        for(int counter = 0;counter<x.length;counter++)
            x[counter]+=5;
    }
}

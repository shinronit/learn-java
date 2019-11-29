public class Tutorial29 {
    public static void main(String[]args){
        int nab[]={12,15,23,65,87};
        int sum=0;
        for(int counter=0;counter<nab.length;counter++){
            sum+=nab[counter];
        }
        System.out.println("The sum of these number is " + sum);
    }
}

import java.util.Scanner;

public class Custom57 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple alphabets printer use keyword small for small and capital for capital");
        String alphabets = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t.u,v,w,x,y,z";
        String capitalalphabets = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        String input = scanner.nextLine();
        if(input.equals("capital")){
            System.out.println(capitalalphabets);
        }else if(input.equals("small")){
            System.out.println(alphabets);
        }
    }
}

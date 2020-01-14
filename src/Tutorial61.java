public class Tutorial61 {
    public static void main (String [] args){

        Animal61[] thelist = new Animal61[2];
        Dog61 d = new Dog61();
        Fish61 f = new Fish61();

        thelist[0]=d;
        thelist[1]=f;

        for(Animal61 x: thelist){
            x.noise();
        }
    }
}

public class AnimalList {

    private Animal60[] thelist = new Animal60[5];
    private int i = 0;

    public void add(Animal60 a){
        if(i<thelist.length){
            thelist[i] = a;
            System.out.println("Animal added at index" +i);
            i++;
        }
    }
}

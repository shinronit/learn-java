public class DogList {
    private Dog59[] thelist = new Dog59[5];
    private int i = 0;

    public void add(Dog59 d){
        if(i<thelist.length){
            thelist[i]=d;
            System.out.println("Dog addeed at index" + i);
            i++;
        }
    }
}

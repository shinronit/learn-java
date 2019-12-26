public class T43 {
    private String name;
    private T43potpie birthday;

    public T43(String theName, T43potpie theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name , birthday );
    }
}

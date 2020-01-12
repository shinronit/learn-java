//String
public class AgeClass {

    private String ages;
    public void setName (String name){
        ages=name;
    }
    public String getName(){
        return ages;
    }
    public void saying(){
        System.out.printf("Your age ",  getName());
    }
}

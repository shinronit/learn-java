public class T39 {
    private int hour;
    private int minute;
    private int second;

    public T39(){
        this(0,0,0);
    }
    public T39(int h){
        this(h,0,0);
    }
    public T39(int h ,int m){
        this(h,m,0);
    }
    public T39(int h,int m, int s){
        setTime(h,m,s);
    }
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
}

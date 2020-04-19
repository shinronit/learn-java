public class Custom153 {
    public static void main(String[] args){
        Values values = realData();
        modData();
        values = realData();
    }
    public static Values realData(){
        int value = 1000;
        int battlecoins = 91000;
        System.out.println("Value Real" + value);
        System.out.println("Value Real" + battlecoins);
        return new Values(value,battlecoins);
    }
    public static void modData(){
        Values values = realData();
        values.battleCoins += 291201902;
        values.value += 1212121;
    }
}

class Values {
    int value;
    int battleCoins;

    public Values(int value, int battleCoins) {
        this.value = value;
        this.battleCoins = battleCoins;
    }
}
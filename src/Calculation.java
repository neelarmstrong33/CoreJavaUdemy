public class Calculation {

    int stockPrice = 20;
    static int carPrice = 40;

    public static  int getPriceOfPen(){
        int capPrice = 2;
        int penBodyPrice = 5;
        return capPrice + penBodyPrice;
    }

    public static int getPrice(){
        carPrice = 50;
        return carPrice;
    }
}

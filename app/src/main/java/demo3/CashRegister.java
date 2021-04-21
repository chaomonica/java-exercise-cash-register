public class CashRegister {
    /*
        cashRegister (like bank)
        initial value moneyValue ??? - $100, $50, $20, $10, $5, $1, quarter, dime, nickel, cents
        total sum?                    
        input example: $4, -$4 
        maximum (infinite)
        functionality: deposit, withdraw
    
    */

    private int hundredDollar = 10;         //1000
    private int fiftyDollar= 10;            //500
    private int twentyDollar= 10;           //200
    private int tenDollar= 10;              //100
    private int fiveDollar= 10;             //50
    private int oneDollar= 10;              //10
    private int quarter= 4;                 //1
    private int dime= 10;                   //1
    private int nickel= 20;                 //1
    private int cent= 100;                  //1
    private double totalValue = 1864;

    public static String withdraw() {
        Calculator.calculate("-");
        return "";
    }

    public static String deposit() {
        Calculator.calculate("+");
        return "";
    }
    
}

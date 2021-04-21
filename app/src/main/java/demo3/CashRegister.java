package demo3;

import java.util.HashMap;

public class CashRegister {
    /*
     * cashRegister (like bank) initial value moneyValue ??? - $100, $50, $20, $10,
     * $5, $1, quarter, dime, nickel, cents total sum? input example: $4, -$4
     * maximum (infinite) functionality: deposit, withdraw
     * 
     */
    private HashMap<String, Integer> register = new HashMap<String, Integer>();
    private double totalValue = 1864;

    public CashRegister() {
        register.put("hundredDollar", 10);
        register.put("fiftyDollar", 10);
        register.put("twentyDollar", 10);
        register.put("tenDollar", 10);
        register.put("fiveDollar", 10);
        register.put("oneDollar", 10);
        register.put("quarter", 4);
        register.put("dime", 10);
        register.put("nickel", 20);
        register.put("cent", 100);
    }

    public String withdraw(double withdrawAmount) {

        // CHECK AGAINST THE TOTALVALUE
        double expectedAmount = Calculator.calculate(withdrawAmount, totalValue, "-");
        if (expectedAmount >= 0) {

            if (changeMaker(withdrawAmount)) {
                totalValue = Calculator.calculate(withdrawAmount, totalValue, "-");
                System.out.println("totalValue: " + totalValue);
            } else {
                // CANNOT EXECUTE TRANSACTION

            }

        } else {
            // CANNOT EXECUTE TRANSACTION
        }

        return "";

    }

    public String deposit(double depositAmount) {

        totalValue = Calculator.calculate(depositAmount, totalValue, "+");
        System.out.println("totalValue: " + totalValue);

        return "";
    }

    public boolean changeMaker(double withdrawAmount) {
        System.out.println("coming through here");
        HashMap<String, Integer> copiedRegister = new HashMap<String, Integer>();
        copiedRegister.putAll(register);

        var wrapper = new Object() {
            double withdrawAmount2 = withdrawAmount;
        };

        copiedRegister.replaceAll((key, value) -> {
            int aCopy = value;
            while (wrapper.withdrawAmount2 > 0) {
                wrapper.withdrawAmount2 -= 0;
                aCopy--;
            }
            return aCopy;

            // System.out.println("key: " + key + " value: " + value);
        });

        return false;
    }

}

/*
 * for (adsjfklfajds : ajsdkfl;jsadk)
 * 
 * lambda list.forEach(s -> {})
 * 
 */
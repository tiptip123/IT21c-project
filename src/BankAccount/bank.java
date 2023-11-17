
package BankAccount;


public class bank {
    
    private String name;
    private int age;
    private int accNum;
    private double balance;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getaccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setAge(int a) {
        this.age = a;

    }

    public void setAccNum(int acc) {
        this.accNum = acc;

    }

    public void setBalance(double b, double c) {
        this.balance = b + c;

    }

}


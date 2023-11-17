
package BankAccount;


public class Main {
    
    public static void main(String[] args) {

        bank j = new bank();
        j.setName("Joseph Jay B Baguio");
        j.setAge(22);
        j.setAccNum(143734);
        j.setBalance(1.3, 1);

        System.out.println("CHINA BANK!" + "\n" + "Name:" + j.getName() + "\n" + "Age:" + j.getAge() + "\n" + "Account Number:" + j.getaccNum() + "\n" + "Balance:" + j.getBalance());

    }
    
    
}

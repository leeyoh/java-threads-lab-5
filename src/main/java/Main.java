public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.deposit(1000);
        Thread t1 = new Thread(() -> account.deposit(100));
        Thread t2 = new Thread(() -> account.withdraw(50));
        t1.start();
        t2.start();
        account.withdraw(40);
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println(account.getTotal());
        }
        System.out.println(account.getTotal());
    }
}

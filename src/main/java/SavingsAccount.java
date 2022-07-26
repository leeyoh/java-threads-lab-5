public class SavingsAccount extends Thread{

  private long total = 0;

  public synchronized boolean withdraw(long amount) {
      if(total >= amount) total -= amount;
      return total >= amount;
  }

  public synchronized void deposit(long amount) {
        total += amount;
  }

  public synchronized long getTotal() {
      return total;
  }
}
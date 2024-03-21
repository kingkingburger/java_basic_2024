package oop1.ex;

public class Account {
  int balance;

  void deposit(int amount) {
    balance += amount;
  }

  void withdraw(int amount) {
    if (this.balance <= amount) {
      System.out.println("잔액부족");
      return;
    }
    this.balance -= amount;
  }
}

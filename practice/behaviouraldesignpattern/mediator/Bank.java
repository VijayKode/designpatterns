package practice.behaviouraldesignpattern.mediator;

public interface Bank {
    boolean hasAvailableBalance(int requestMoney);
    boolean requestMoney(int money);
}

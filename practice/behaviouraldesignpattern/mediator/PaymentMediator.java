package practice.behaviouraldesignpattern.mediator;

public interface PaymentMediator {
     boolean transferRequest(int amount);
     void setFrom(Bank from);
}

package practice.structuraldesignpattern.facade;

public interface Bank {
    Loan getLoans();
    Card getCards();
    Deposit getDeposits();
}

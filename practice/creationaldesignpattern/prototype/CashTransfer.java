package practice.creationaldesignpattern.prototype;

public class CashTransfer implements Transfer {
    private String fromAccount;
    private String toAccount;
    private Double amount;

    public CashTransfer(String fromAccount, String toAccount, Double amount) {
        // db call or complex processing logic to check transfer allowed or not
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }
    @Override
    public Transfer clone() {
        return new CashTransfer(this.fromAccount, this.toAccount, this.amount);
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

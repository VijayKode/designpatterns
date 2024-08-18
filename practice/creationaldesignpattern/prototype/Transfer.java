package practice.creationaldesignpattern.prototype;

public interface Transfer {
    Transfer clone();
    void setAmount(Double amount);
}

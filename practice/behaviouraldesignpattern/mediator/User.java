package practice.behaviouraldesignpattern.mediator;

import practice.behaviouraldesignpattern.mediator.impl.Hdfc;
import practice.behaviouraldesignpattern.mediator.impl.Icici;

public class User {

    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.transfer(new Hdfc(), new Icici(), 25);
    }
}

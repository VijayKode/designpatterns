package practice.behaviouraldesignpattern.strategyPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseContext {

    private Strategy strategy;

    void purchase(){
        strategy.buy();
    }

}

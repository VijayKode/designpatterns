package practice.behaviouraldesignpattern.chainofresponsibility.handlers;

import practice.behaviouraldesignpattern.chainofresponsibility.Level;
import practice.behaviouraldesignpattern.chainofresponsibility.Request;

public class CancelByAdmin implements Level {
    @Override
    public String handle(Request request) {
        boolean qualityCheckPassed = isQualityCheckPassed();
        if(qualityCheckPassed) {
            return "Cancellation, accepted, " +
                    "refund will be initiated after pickup";
        }
        return "Cancellation, noy accepted, quality Checks failed";
    }

    private boolean isQualityCheckPassed() {
        return true;
    }


}

package ru.cardsim.app.rules.logicoperators;

/**
 * Created by bombaster on 09.02.2016.
 */
public class LogicOperator {
    private boolean result;


    public boolean getResult() {
        return result;
    }

    protected void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "LogicOperator{" +
                "result=" + result +
                '}';
    }
}

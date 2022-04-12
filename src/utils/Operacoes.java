package utils;

import javax.swing.*;
import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class Operacoes {

    private static Operacoes instance;
    private String lastOperation = "";
    private BigDecimal total = ZERO;

    public static Operacoes getInstance() {
        if (instance == null) {
            instance = new Operacoes();
        }
        return instance;
    }

    private Operacoes() {
    }

    public BigDecimal som(BigDecimal value, String lastOperation) {
        this.lastOperation = lastOperation;
        if (total.equals(ZERO)) {
            total = value;
            return total;
        }
        return this.total.add(value);
    }

    public BigDecimal sub(BigDecimal value, String lastOperation) {
        this.lastOperation = lastOperation;
        if (total.equals(ZERO)) {
            total = value;
            return total;
        }
        return this.total.subtract(value);
    }

    public BigDecimal mult(BigDecimal value, String lastOperation) {
        this.lastOperation = lastOperation;
        if (total.equals(ZERO)) {
            total = value;
            return total;
        }
        return this.total.multiply(value);
    }

    public BigDecimal div(BigDecimal value, String lastOperation) {
        this.lastOperation = lastOperation;
        if (total.equals(ZERO)) {
            total = value;
            return total;
        }
        return total.divide(value);
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void clean() {
        this.lastOperation = "";
        this.total = ZERO;
    }

}

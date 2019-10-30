package com.soft.homework.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public abstract class Sequence {
    private List<BigInteger> sequence = new ArrayList<>();

    public void setSequence(List<BigInteger> sequence) {
        this.sequence = sequence;
    }

    public List<BigInteger> getSequence() {
        return sequence;
    }

    public abstract List<BigInteger> getRow(BigInteger... args);

    public abstract void showInfo();
}

package com.soft.homework.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public abstract class Sequence {
    private List<BigInteger> sequence = new ArrayList<>();

    void setSequence(List<BigInteger> sequence) {
        this.sequence = sequence;
    }

    List<BigInteger> getSequence() {
        return sequence;
    }

    public abstract List<BigInteger> getSequenceInRange(BigInteger min, BigInteger max);

    public abstract List<BigInteger> getSequenceByLengthNumber(BigInteger lengthNumber);

    public abstract void showInfo();
}

package com.soft.homework.envelope;

public class EnvelopeComparator {

    public static boolean compareEnvelope (Envelope a, Envelope b) {
        boolean result = false;

        if (a.getMaxSide() >= b.getMaxSide() && a.getMinSide() >= b.getMinSide()) {
            result = true;
        }

        if (a.getMaxSide() <= b.getMaxSide() && a.getMinSide() <= b.getMinSide()) {
            result = true;
        }

        return result;
    }
}

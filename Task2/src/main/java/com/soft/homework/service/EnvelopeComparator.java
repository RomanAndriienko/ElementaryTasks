package com.soft.homework.service;

import com.soft.homework.model.Parcel;

public class EnvelopeComparator implements Comparator {

    @Override
    public boolean compare(Parcel a, Parcel b) {
        boolean result = false;

        if (a.getMaxSide() > b.getMaxSide() && a.getMinSide() > b.getMinSide()) {
            result = true;
        }

        if (a.getMaxSide() < b.getMaxSide() && a.getMinSide() < b.getMinSide()) {
            result = true;
        }

        return result;
    }
}

package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private String isPostmarked;
    private double stampWidth;
    private double stampLength;

    public Stamp(String stampName, String isPostmarked, double stampWidth, double stampLength) {
        this.stampName = stampName;
        this.isPostmarked = isPostmarked;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
    }
    public String getStampName() {return stampName;}
    public String getIsPostmarked()  {return isPostmarked;}
    public double getStampWidth() {
        return stampWidth;
    }
    public double getStampLength() {
        return stampLength;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        com.kodilla.collections.sets.homework.Stamp stamp = (com.kodilla.collections.sets.homework.Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0
                && Double.compare(stamp.stampLength, stampLength) == 0
                && this.stampName.equals(stamp.stampName)
                && this.isPostmarked.equals(stamp.isPostmarked);

    }

    @Override public int hashCode() {
        return Objects.hash(stampName, isPostmarked, stampWidth, stampLength);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", isPostmarked='" + isPostmarked + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                '}';
    }
}




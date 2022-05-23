package com.bext.resttemplatelab;

import java.math.BigDecimal;
import java.util.Date;

public class ObjectRich {
    private int anInt;
    private long aLong;
    private Integer integer;
    private Double aDouble;
    private BigDecimal bigDecimal;
    private String text;
    private Date aDate;

    public ObjectRich() {
    }

    public ObjectRich(int anInt, long aLong, Integer integer, Double aDouble, BigDecimal bigDecimal, String text, Date aDate) {
        this.anInt = anInt;
        this.aLong = aLong;
        this.integer = integer;
        this.aDouble = aDouble;
        this.bigDecimal = bigDecimal;
        this.text = text;
        this.aDate = aDate;
    }

    public ObjectRich(int i, int i1, int i2, int i3, String texto, Date date) {
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    @Override
    public String toString() {
        return "ObjectRich{" +
                "anInt=" + anInt +
                ", aLong=" + aLong +
                ", integer=" + integer +
                ", aDouble=" + aDouble +
                ", bigDecimal=" + bigDecimal +
                ", text='" + text + '\'' +
                ", aDate=" + aDate +
                '}';
    }
}

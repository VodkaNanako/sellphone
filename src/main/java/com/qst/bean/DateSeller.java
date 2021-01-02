package com.qst.bean;

public class DateSeller {
    int years;
    int months;
    int weeks;
    int days;
    int count;



    public DateSeller(){}
    public DateSeller(int years, int months, int weeks, int days, int count) {
        this.years = years;
        this.months = months;
        this.weeks = weeks;
        this.days = days;
        this.count=count;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DateSeller{" +
                "years=" + years +
                ", month=" + months +
                ", week=" + weeks +
                ", day=" + days +
                ", count=" + count +
                '}';
    }
}

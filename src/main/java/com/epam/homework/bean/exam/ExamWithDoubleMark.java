package com.epam.homework.bean.exam;

public class ExamWithDoubleMark implements IExam {

    private final String name;
    private final double minMark;
    private final double maxMark;

    private double mark;

    public ExamWithDoubleMark(String name, double minMark, double maxMark) {
        this.name = name;
        this.minMark = minMark;
        this.maxMark = maxMark;
    }

    public String getName() {
        return name;
    }

    public double getMinMark() {
        return minMark;
    }

    public double getMaxMark() {
        return maxMark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isMarkValid(double mark) {
        if (mark >= minMark && mark <= maxMark) {
            return true;
        } else {
            System.out.printf("Current mark '%s' is out of the scope [%s,%s]", mark, minMark, maxMark);
            return false;
        }
    }

}

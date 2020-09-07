package com.epam.homework.bean.exam;

public class ExamWithIntegerMark implements IExam {

    private final String name;
    private final int minMark;
    private final int maxMark;
    private int mark;

    public ExamWithIntegerMark(String name, int minMark, int maxMark) {
        this.name = name;
        this.minMark = minMark;
        this.maxMark = maxMark;
    }

    public String getName() {
        return name;
    }

    public int getMinMark() {
        return minMark;
    }

    public int getMaxMark() {
        return maxMark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean isMarkValid(int mark) {
        if (mark >= minMark && mark <= maxMark) {
            return true;
        } else {
            System.out.printf("Current mark '%s' is out of the scope [%s,%s]", mark, minMark, maxMark);
            return false;
        }
    }

}

package com.epam.homework.bean.event;

import com.epam.homework.bean.exam.ExamWithIntegerMark;

public class TwoIntegerExamsControlEventImpl extends ControlEventAbstract {

    private final ExamWithIntegerMark exam1;
    private final ExamWithIntegerMark exam2;
    private final int minimalMark;

    public TwoIntegerExamsControlEventImpl(String name,
                                           ExamWithIntegerMark exam1,
                                           ExamWithIntegerMark exam2,
                                           int minimalMark) {
        super(name);
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.minimalMark = minimalMark;
    }

    @Override
    public boolean isPassed() {
        int sum = exam1.getMark() + exam2.getMark();
        return sum >= minimalMark;
    }

    @Override
    public String toString() {
        return "TwoIntegerExamsControlEventImpl{" +
                "name='" + super.getName() + '\'' +
                ", exam1=" + exam1 +
                ", exam2=" + exam2 +
                ", minimalMark=" + minimalMark +
                '}';
    }

}

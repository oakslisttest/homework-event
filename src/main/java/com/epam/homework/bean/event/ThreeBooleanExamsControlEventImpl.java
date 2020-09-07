package com.epam.homework.bean.event;

import com.epam.homework.bean.exam.ExamWithBooleanMark;

public class ThreeBooleanExamsControlEventImpl extends ControlEventAbstract {

    private final ExamWithBooleanMark exam1;
    private final ExamWithBooleanMark exam2;
    private final ExamWithBooleanMark exam3;

    public ThreeBooleanExamsControlEventImpl(String name,
                                             ExamWithBooleanMark exam1,
                                             ExamWithBooleanMark exam2,
                                             ExamWithBooleanMark exam3) {
        super(name);
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    @Override
    public boolean isPassed() {
        return exam1.isPassed() && exam2.isPassed() && exam3.isPassed();
    }

}

package com.epam.homework.bean.event;

import com.epam.homework.bean.exam.ExamWithBooleanMark;
import com.epam.homework.bean.exam.ExamWithDoubleMark;

public class DoubleAndBooleanExamsControlEventImpl extends ControlEventAbstract {

    private ExamWithDoubleMark exam1;
    private ExamWithBooleanMark exam2;
    private final int minimalMark;

    public DoubleAndBooleanExamsControlEventImpl(String name,
                                                 ExamWithDoubleMark exam1,
                                                 ExamWithBooleanMark exam2,
                                                 int minimalMark) {
        super(name);
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.minimalMark = minimalMark;
    }

    public ExamWithDoubleMark getExam1() {
        return exam1;
    }

    public void setExam1(ExamWithDoubleMark exam1) {
        this.exam1 = exam1;
    }

    public ExamWithBooleanMark getExam2() {
        return exam2;
    }

    public void setExam2(ExamWithBooleanMark exam2) {
        this.exam2 = exam2;
    }

    @Override
    public boolean isPassed() {
        return (exam1.getMark() >= minimalMark) && exam2.isPassed();
    }

}

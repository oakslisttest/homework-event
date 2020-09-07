package com.epam.homework.bean.exam;

public class ExamWithBooleanMark implements IExam {

    private String name;
    private boolean isPassed;

    public ExamWithBooleanMark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

}

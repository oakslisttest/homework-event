package com.epam.homework.bean.event;

public abstract class ControlEventAbstract implements ControlEventInterface {

    private final String name;
//    private final List<IExam> examList;

    //    public ControlEventAbstract(String name, List<IExam> examList) {
    public ControlEventAbstract(String name) {
        this.name = name;
//        this.examList = examList;
    }

//    public List<IExam> getExamList() {
//        return examList;
//    }

    public String getName() {
        return name;
    }

}

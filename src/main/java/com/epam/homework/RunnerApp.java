package com.epam.homework;

import com.epam.homework.bean.dao.Storage;
import com.epam.homework.bean.event.ControlEventAbstract;
import com.epam.homework.bean.event.DoubleAndBooleanExamsControlEventImpl;
import com.epam.homework.bean.event.ThreeBooleanExamsControlEventImpl;
import com.epam.homework.bean.event.TwoIntegerExamsControlEventImpl;
import com.epam.homework.bean.exam.ExamWithBooleanMark;
import com.epam.homework.bean.exam.ExamWithDoubleMark;
import com.epam.homework.bean.exam.ExamWithIntegerMark;

public class RunnerApp {

    public static void main(String[] args) {
        TwoIntegerExamsControlEventImpl event1 = new TwoIntegerExamsControlEventImpl(
                "ASOIEvent",
                new ExamWithIntegerMark("Math", 1, 10),
                new ExamWithIntegerMark("English", 1, 15),
                10);
        TwoIntegerExamsControlEventImpl event2 = new TwoIntegerExamsControlEventImpl(
                "PhysicEvent",
                new ExamWithIntegerMark("Physic", 1, 10),
                new ExamWithIntegerMark("English", 1, 15),
                12);
        DoubleAndBooleanExamsControlEventImpl event3 = new DoubleAndBooleanExamsControlEventImpl(
                "MathEvent",
                new ExamWithDoubleMark("Math", 1, 10),
                new ExamWithBooleanMark("English"),
                6);
        ThreeBooleanExamsControlEventImpl event4 = new ThreeBooleanExamsControlEventImpl(
                "HistoryEvent",
                new ExamWithBooleanMark("Logic"),
                new ExamWithBooleanMark("English"),
                new ExamWithBooleanMark("History"));

        Storage storage = new Storage();
        storage.addOrUpdateControlEvent(event1);
        storage.addOrUpdateControlEvent(event2);
        storage.addOrUpdateControlEvent(event3);
        storage.addOrUpdateControlEvent(event4);

        System.out.println(storage.getEventSet().size());

        ControlEventAbstract event = storage.getControlEventByEventName("PhysicEvent");
        System.out.println(event.getName());

    }

}

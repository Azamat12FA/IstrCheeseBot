package com.example.IstrCheeseBot.model;

import java.util.GregorianCalendar;

public class Task {
    int id;
    GregorianCalendar endDate;
    String nameTask, descriptionTask;

    public Task(int id, GregorianCalendar endDate, String nameTask, String descriptionTask) {
        this.id = id;
        this.endDate = endDate;
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
    }

    @Override
    public String toString() {
        return "Задача №" + id +
                ";\nСрок сдачи: " + endDate +
                ";\nНазвание задачи: '" + nameTask +
                ";\nОписание задачи: '" + descriptionTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }
}

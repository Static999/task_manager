package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void testWhenSimpleTaskFound() {
        // Подготовка
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        // Шаги
        boolean actual = simpleTask.matches("Позвонить");

        // Проверка
        Assertions.assertTrue(actual);
    }

    @Test
    public void testWhenSimpleTaskNotFound() {
        // Подготовка
        SimpleTask simpleTask = new SimpleTask(5, "Написать родителям");

        // Шаги
        boolean actual = simpleTask.matches("Позвонить");

        // Проверка
        Assertions.assertFalse(actual);
    }

    @Test
    public void testWhenEpicTaskFound() {
        // Подготовка
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        // Шаги
        boolean actual = epic.matches("Яйца");

        // Проверка
        Assertions.assertTrue(actual);
    }

    @Test
    public void testWhenMeetingTaskFound() {
        // Подготовка
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        // Шаги
        boolean actual = meeting.matches("НетоБанк");

        // Проверка
        Assertions.assertTrue(actual);
    }

}
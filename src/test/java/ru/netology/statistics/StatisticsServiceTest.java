package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();


    @Test
    void shouldFindMax() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 11, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMaxMiddleInArray() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 30, 12};
        long expected = 30;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMaxIndexEndInArray() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 40};
        long expected = 40;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

}
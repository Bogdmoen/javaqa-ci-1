package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();


    @Test
    void shouldFindMaxIndexFirstInArray() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 11, 8, 6, 11, 11, 12};
        long expected = 0;

        long actual = service.findMaxIndex(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMaxIndexMiddleInArray() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 30, 12};
        long expected = 5;

        long actual = service.findMaxIndex(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMaxIndexEndInArray() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 40};
        long expected = 10;

        long actual = service.findMaxIndex(incomesInBillions);

        assertEquals(expected, actual);

    }

}
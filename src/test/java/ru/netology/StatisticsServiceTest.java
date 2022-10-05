package ru.netology;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

   public class StatisticsServiceTest {

        @Test
        void findMax1() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
        void findMax2() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {11, 11, 10, 5, 4, 3, 6, 6, 7, 9, 10};
            long expected = 11;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
        void findMax3() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            long expected = 0;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
        void findMax4() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
            long expected = 6;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }

        @Test
        void findMax5() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {13, 9, 10, 5, 4, 3, 6, 6, 7, 9, 15};
            long expected = 15;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
    }


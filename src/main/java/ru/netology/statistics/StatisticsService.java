package ru.netology.statistics;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */

    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes)
            if (currentMax < income) {

                currentMax = income;
            }
        return currentMax;
    }

    public long findMaxIndex(long[] incomes) {
        long currentMax = findMax(incomes);
        long indexOfMaxIncome = 0;
        for (int i = 0; i < incomes.length; i++) {

            if (currentMax == incomes[i]) {
                indexOfMaxIncome = i;
                break;
            }
        }
        return indexOfMaxIncome;
    }
}


package communication;

public class DaysCalculator {
    private int numberOfDaysToRest;
    private int numberOfDaysBeforeChristmas;
    private int numbersOfDaysForComingBack;

    public DaysCalculator(int numberOfDaysToRest, int numberOfDaysBeforeChristmas, int numbersOfDaysForComingBack) {
        this.numberOfDaysToRest = numberOfDaysToRest;
        this.numberOfDaysBeforeChristmas = numberOfDaysBeforeChristmas;
        this.numbersOfDaysForComingBack = numbersOfDaysForComingBack;
    }

    public int daysBeforeReturn() {
        return numberOfDaysBeforeChristmas - numbersOfDaysForComingBack - numberOfDaysToRest;
    }

    public int getNumberOfDaysToRest() {
        return numberOfDaysToRest;
    }

    public void setNumberOfDaysToRest(int numberOfDaysToRest) {
        this.numberOfDaysToRest = numberOfDaysToRest;
    }

    public int getNumberOfDaysBeforeChristmas() {
        return numberOfDaysBeforeChristmas;
    }

    public void setNumberOfDaysBeforeChristmas(int numberOfDaysBeforeChristmas) {
        this.numberOfDaysBeforeChristmas = numberOfDaysBeforeChristmas;
    }

    public int getNumbersOfDaysForComingBack() {
        return numbersOfDaysForComingBack;
    }

    public void setNumbersOfDaysForComingBack(int numbersOfDaysForComingBack) {
        this.numbersOfDaysForComingBack = numbersOfDaysForComingBack;
    }
}

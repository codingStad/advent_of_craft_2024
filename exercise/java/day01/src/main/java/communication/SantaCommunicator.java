package communication;

public class SantaCommunicator {
    private final int numberOfDaysToRest;

    public SantaCommunicator(int numberOfDaysToRest) {
        this.numberOfDaysToRest = numberOfDaysToRest;
    }

    public String composeMessage(ReindeerLocation reindeerLocation) {
        DaysCalculator daysCalculator = new DaysCalculator(numberOfDaysToRest, reindeerLocation.numberOfDaysBeforeChristmas(), reindeerLocation.numbersOfDaysForComingBack());

        var daysBeforeReturn = daysCalculator.daysBeforeReturn();

        return "Dear " + reindeerLocation.reindeerName() + ", please return from " + reindeerLocation.currentLocation() +
                " in " + daysBeforeReturn + " day(s) to be ready and rest before Christmas.";
    }

    public boolean isOverdue(ReindeerLocation reindeerLocation, Logger logger) {
        DaysCalculator daysCalculator = new DaysCalculator(numberOfDaysToRest, reindeerLocation.numberOfDaysBeforeChristmas(), reindeerLocation.numbersOfDaysForComingBack());
        var daysBeforeReturn = daysCalculator.daysBeforeReturn();
        if (daysBeforeReturn <= 0) {
            logger.log("Overdue for " + reindeerLocation.reindeerName() + " located " + reindeerLocation.currentLocation() + ".");
            return true;
        }
        return false;
    }

}
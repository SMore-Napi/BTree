package calculation;

public class Calculation {
    /**
     * Randomise the number between [l;r]
     *
     * @param l left border
     * @param r right border
     * @return number in the [l;r] range
     */
    public static int getRandomInRange(int l, int r) {
        return (int) (Math.random() * (r + 1 - l)) + l;
    }

    /**
     * Randomise the number
     *
     * @param maxValue max value to randomise
     * @return random number
     */
    public static int getRandomNumber(int maxValue) {
        return (int) (Math.random() * maxValue);
    }
}

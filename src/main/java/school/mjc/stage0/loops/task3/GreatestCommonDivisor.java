package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        for (int higher = first > second ? first : second; higher > 0; higher--) {
            if (first % higher == 0 && second % higher == 0) {
                System.out.println(higher);
            }
        }
    }
}

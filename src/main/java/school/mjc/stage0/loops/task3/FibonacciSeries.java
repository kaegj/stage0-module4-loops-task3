package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int temp = 0;
        for (int i = 0; i <= lastFibonacci; i++) {
            temp += i;
            System.out.println(temp);
            i++;
        }
    }
}

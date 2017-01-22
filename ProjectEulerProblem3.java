package projecteulerproblem3;

public class ProjectEulerProblem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long value = 600851475143L;
        Long largestPrimeFactor = getLargestPrimeFactor(value);

        if (largestPrimeFactor > 0) {
            System.out.println("The largest prime factor is: " + largestPrimeFactor);
        } else {
            System.out.println("Is this number a prime?");
        }
    }

    /**
     * @param number
     * @return long
     */
    public static long getLargestPrimeFactor(long number) {
        Long upperLimit = getFactorUpperLimit(number);

        for (Long x = upperLimit; x > 2L; x -= 2L) {
            if (number % x == 0) {
                if (isPrime(x)) {
                    return x;
                }
            }
        }

        return -1;
    }

    /**
     * @param number
     * @return long
     */
    public static long getFactorUpperLimit(long number) {
        Long limit = (long) Math.sqrt(number);

        if (limit % 2L == 0L) {
            --limit;
        }

        return limit;
    }

    /**
     * @param number
     * @return boolean
     */
    public static boolean isPrime(Long number) {
        if (number == 1L || number == 2L || number == 3L) {
            return true;
        } else if (number % 2 == 0L || number % 3 == 0L) {
            return false;
        }

        Long initialCounter = (long) Math.sqrt(number);

        if (initialCounter % 2L == 0L) {
            --initialCounter;
        }

        for (Long x = 3L; x <= initialCounter; x += 2) {
            if (number % x == 0L) {
                return false;
            }
        }

        return true;
    }
}

package projecteulerproblem3;

public class ProjectEulerProblem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Long value = 600851475143L;
        System.out.println("start");
        Long v = value / 4;

        if (v % 2L == 0L) {
            --v;
        }

        for (Long x = v; x > 4L; x = x - 2L) {
            if (value % x == 0) {
                if (isPrime(x)) {
                    System.out.println(x + " Is the largest prime factor");

                    break;
                } else {
                    System.out.println(x + " is a factor, but NOT prime");
                }
            }
        }
    }

    /**
     * @param number
     * @return boolean
     */
    public static boolean isPrime(Long number) {
        if (number == 1L || number == 2L || number == 3L) {
            return true;
        }

        if (number % 2L == 0L || number % 3L == 0L) {
            return false;
        }

        Long limit = 4L;
        Long initialCounter = Math.floorDiv(number, limit);

        if (initialCounter % 2L == 0L) {
            --initialCounter;
        }

        while (limit <= initialCounter) {
            if (number % initialCounter == 0L) {
                return false;
            }

            initialCounter -= 2L;
        }

        return true;
    }
}

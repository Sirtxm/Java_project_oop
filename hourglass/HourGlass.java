package hourglass;

/**
 * A simulation of an hourglass that tracks sand movement based on rotation angle.
 */
public class HourGlass {
    int sandA = 5000, sandB = 0; // Initial sand: all in A side
    int degree = 0;              // Rotation angle: 0 (upright), 180 (flipped), etc.

    /**
     * Provides an initial recommendation or description.
     */
    void recommend() {
        System.out.println("The hourglass stands upright with all the sand in side A (5000 grains).");
    }

    /**
     * Rotates the hourglass 90 degrees to the right.
     */
    void rotateRight90() {
        if (degree < 360) {
            degree += 90;
        } else {
            degree = 0;
        }
        System.out.println("Rotated to: " + degree + " degrees");
    }

    /**
     * Rotates the hourglass 180 degrees to the right.
     */
    void rotateRight180() {
        if (degree < 360 && degree != 270) {
            degree += 180;
        } else if (degree == 270) {
            degree = 90;
        } else {
            degree = 0;
        }
        System.out.println("Rotated to: " + degree + " degrees");
    }

    /**
     * Simulates the flow of sand between sides A and B depending on the current angle.
     */
    void sand() {
        if (degree == 0 && sandB == 0) {
            // Case: start with full A, no B — sand flows downward
            for (sandA = 5000; sandA > 0; sandA -= 1000, sandB += 1000) {
                System.out.println("SandA = " + sandA + " SandB = " + sandB);
                sleep(1000);
            }
            System.out.println("SandA = " + sandA + " SandB = " + sandB);
        }

        else if (degree == 0 && sandB != 0) {
            // Reset and flow again from A
            sandB = 0;
            for (sandA = 5000; sandA > 0; sandA -= 1000, sandB += 1000) {
                System.out.println("SandA = " + sandA + " SandB = " + sandB);
                sleep(1000);
            }
            System.out.println("SandA = " + sandA + " SandB = " + sandB);
        }

        else if (degree == 90 || degree == 270) {
            // Sideways — no movement
            System.out.println("SandA = " + sandA + " SandB = " + sandB);
        }

        else if (degree == 180) {
            // Flipped upside down — sand flows back from B to A
            for (sandA = 0; sandB > 0; sandA += 1000, sandB -= 1000) {
                System.out.println("SandA = " + sandA + " SandB = " + sandB);
                sleep(1000);
            }
            System.out.println("SandA = " + sandA + " SandB = " + sandB);
        }

        else if (degree == 360) {
            // Full rotation returns to original — sand flows again
            for (sandA = 5000; sandA >= 0; sandA -= 1000, sandB += 1000) {
                System.out.println("SandA = " + sandA + " SandB = " + sandB);
                sleep(1000);
            }
            System.out.println("SandA = " + sandA + " SandB = " + sandB);
        }

        else {
            System.out.print("Error!!!");
        }
    }

    /**
     * Utility method to delay execution, simulating real-time sand flow.
     *
     * @param milliseconds time to sleep
     */
    private void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

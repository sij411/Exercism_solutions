class Darts {
    int score(double xOfDart, double yOfDart) {
         if (outOfRange(xOfDart, yOfDart, 10)) {
             return 0;
         }
         if (outOfRange(xOfDart, yOfDart, 5))
             return 1;
         if (outOfRange(xOfDart, yOfDart, 1))
             return 5;
         return 10;
    }

    static boolean outOfRange(double x, double y, int coord) {
        return -coord > x || x > coord && y < -coord || y > coord;
    }
}

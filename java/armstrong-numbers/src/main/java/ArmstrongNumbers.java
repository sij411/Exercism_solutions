class ArmstrongNumbers {

    static boolean isArmstrongNumber(int numberToCheck) {
        int number = numberToCheck;

       // n번째 자릿수 ^ n
        int sum = 0;
        int i = 1;
        while (number >= 10) {
            number = number / 10;
            i++;
        }

        int n = numberToCheck;
        for (int j = 1; j <= i; j++) {
            int r = n % 10;
            sum += (int) Math.pow(r, i);
            n = n / 10;

        }

        return numberToCheck == sum;
    }



}

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
/*
 Solutions that got most reps
* import java.util.Arrays;
import java.util.function.Function;
// import java.util.List;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

      if (numberToCheck < 10) return true;
      var digitCount = (int)Math.log10(numberToCheck) + 1;
      var num = numberToCheck;
      var pow_total = 0;
      for (;num > 0;) {
        var pow_temp = num % 10;
        var pow_temp_total = 1;
        for (var i = 0; i < digitCount; i++) {
          pow_temp_total *= pow_temp;
        }
        pow_total += pow_temp_total;
        num /= 10;
      }
      return numberToCheck == pow_total;
    }
}
*
* */
class Leap {

    boolean isLeapYear(int year) {
        // 4로 나누어 떨어져야 함
        // 100으로 나누어 떨어진다면, 400으로도 나누어 떨어져야 함
        if (year % 4 != 0)
            return false;
        if (year % 100 == 0 && year % 400 != 0)
            return false;
        return true;
    }

}

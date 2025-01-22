class DaysInYear {
    public static int numberOfDaysInAYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 366 : 365;
    }

    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            System.out.println("Year " + year + " has " + numberOfDaysInAYear(year) + " days.");
        }
    }
}

package InfosysSpringboard;

class Switch {
    public static void main(String[] args) {
        int day = 1;
        int month = 9;
        int year = 15;

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        int maxDays;

        // Determine max days in the current month
        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            default:
                maxDays = 31;
        }

        // Increment logic
        if (day < maxDays) {
            nextDay = day + 1;
        } else {
            nextDay = 1;
            if (month < 12) {
                nextMonth = month + 1;
            } else {
                nextMonth = 1;
                nextYear = year + 1;
            }
        }

        System.out.println(nextDay + "-" + nextMonth + "-" + (2000 + nextYear));
    }
}
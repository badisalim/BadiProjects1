package Enums;

enum Day {
    SUNDAY(7), MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int value;

    Day(int value) {
        this.value = value;
    }

    // Driver class that contains an object of "day" and
// main().
    public static class Test {
        private static Day day;

        // Constructor
        public Test(Day day) {
            this.day = day;
        }

        // Prints voida line about Day using switch
        public void dayIsLike() {
            switch (day) {
                case MONDAY:
                    System.out.println("Mondays are bad." + day.toString());
                    break;
                case FRIDAY:
                    System.out.println("Fridays are better.");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekends are best.");
                    break;
                default:
                    System.out.println("Midweek days are so-so.");
                    break;
            }
        }

        public static void main(String[] args) {

            for (Day cNam : Day.values()) {

                // System.out.println("Day: " + cNam + ": " + cNam.value);
                // Driver method
                String str = "MONDAY";
                Test t1 = new Test(Day.valueOf(str));
                t1.dayIsLike();

            }
            System.out.println("Numbers of days: " + Day.values().length);
            System.out.println("Monday Value is: " + MONDAY.value);
        }
    }
    private void day() {

    }
}


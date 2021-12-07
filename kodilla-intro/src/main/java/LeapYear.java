public class LeapYear {
    public static void main(String[] args) {

        int year = 2021;
        boolean leap = false;

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            leap = true;
        }
        else
        {
            leap = false;
        }

        if (leap == false)
            System.out.println("The year 2021 is a leap year");
        else
            System.out.println("The year 2021 is not a leap year");
    }
}


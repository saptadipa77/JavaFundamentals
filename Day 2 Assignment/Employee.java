public  class Employee {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_WORKING_HOURS = 100;



    // UC 1: Check Attendance
    public int checkAttendance() {
       return (int)Math.floor(Math.random()*10)%2;
    }

    // UC 2: Calculate Daily Wage
    public int calculateDailyWage() {
        return WAGE_PER_HOUR * FULL_DAY_HOUR;
    }

    // UC 3: Part-time Employee Wage
    public int calculatePartTimeWage() {
        return PART_TIME_HOUR * WAGE_PER_HOUR;
    }

    // UC 4: Solve using switch-case
    public int getWorkingHours(int empCheck) {
        switch (empCheck) {
            case 1:
                return FULL_DAY_HOUR;      // Full time
            case 2:
                return PART_TIME_HOUR;     // Part-time
            default:
                return 0;                  // Absent
        }
    }

    // UC 5: Monthly wage calculation
    public int calculateMonthlyWage() {
        int monthlyWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empCheck = (int)Math.floor(Math.random()*10)%2; // 0,1,2
            int hours = getWorkingHours(empCheck);
            int wage = hours * WAGE_PER_HOUR;

            monthlyWage += wage;
        }

        return monthlyWage;
    }

    // UC 6: Wage till total hours or days limit
    public int calculateWageTillCondition() {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < MAX_WORKING_HOURS && totalDays < WORKING_DAYS_PER_MONTH) {
            totalDays++;

            int empCheck = (int)Math.floor(Math.random()*10)%2;
            int hours = getWorkingHours(empCheck);

            totalHours += hours;
            totalWage += hours * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);

        return totalWage;
    }



public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Employee emp = new Employee();


        int attendance = emp.checkAttendance();
        System.out.println("UC1: Attendance = " + (attendance == 1 ? "Present" : "Absent"));


        System.out.println("UC2: Daily Employee Wage = " + emp.calculateDailyWage());


        System.out.println("UC3: Daily Part-time Wage = " + emp.calculatePartTimeWage());


        System.out.println("UC5: Monthly Wage = " + emp.calculateMonthlyWage());


        System.out.println("UC6: Wage Till Condition (100 hrs OR 20 days) = " + emp.calculateWageTillCondition());

        System.out.println("Thank You!");
    }
}


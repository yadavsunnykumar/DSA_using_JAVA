package Array;

public class NoOfEmpWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (!(hours[i] < target)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        NoOfEmpWhoMetTarget n = new NoOfEmpWhoMetTarget();
        int[] hours = { 0, 1, 2, 3, 4 };
        int target = 2;
        int noOfTargetMet = n.numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println("Number of employees who met the target is: " + noOfTargetMet);

    }
}

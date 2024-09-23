class YearlyMaintenanceCost {
    public static void main(String[] args) {
        System.out.println("Input costs for each season below!");

        double springCost = 1;
        double summerCost = 2;
        double fallCost = 3;
        double winterCost = 4;
        double totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Your cost for Spring was " + springCost);
        System.out.println("Your cost for Summer was " + summerCost);
        System.out.println("Your cost for Fall was " + fallCost);
        System.out.println("Your cost for Winter was " + winterCost);
        System.out.println("Your total cost for the year was " + totalCost);
    }
}
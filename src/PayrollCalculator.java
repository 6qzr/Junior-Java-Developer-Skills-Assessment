import java.util.Objects;

public class PayrollCalculator {
    // Method to calculate weekly pay based on employee type and hours
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {
        // Employee types: "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN"
        // Use switch case for different rules:
        // FULL_TIME: Regular pay for 40 hours, overtime (1.5x) for hours > 40
        // PART_TIME: Regular pay, no overtime, max 25 hours
        // CONTRACTOR: Flat rate, no overtime rules
        // INTERN: 20% discount from hourly rate, max 20 hours
        // Handle invalid employee types and negative values
        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("Invalid input values.");
            return 0.0;
        }

        double weeklyPay = 0.0;

        switch (employeeType) {
            case "FULL_TIME":
                if (hoursWorked <= 40) {
                    weeklyPay = hoursWorked * hourlyRate;
                } else {
                    double overtime = hoursWorked - 40;
                    weeklyPay = (40 * hourlyRate) + (overtime * hourlyRate * 1.5);
                }
                break;

            case "PART_TIME":
                if (hoursWorked > 25) {
                    System.out.println("Exceeds allowed hours");
                }
                weeklyPay = hoursWorked * hourlyRate;
                break;

            case "CONTRACTOR":
                weeklyPay = hoursWorked * hourlyRate;
                break;

            case "INTERN":
                if (hoursWorked > 20) {
                    System.out.println("Exceeds allowed hours");
                }
                weeklyPay = hoursWorked * hourlyRate * 0.8; // 20% discount
                break;

            default:
                System.out.println("Invalid employee type.");
                return 0.0;
        }
        return weeklyPay;
    }

    // Method to calculate tax deduction based on pay brackets
    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        // Tax brackets using nested if-else:
        // $0-500: 10% tax
        // $501-1000: 15% tax
        // $1001-2000: 20% tax
        // Above $2000: 25% tax
        // If hasHealthInsurance is true, reduce tax by $50
        // Return total tax amount
        double totalTax;
        if (grossPay > 500) {
            if (grossPay > 1000) {
                if (grossPay > 2000) {
                    totalTax = grossPay * 0.25;
                } else {
                    totalTax = grossPay * 0.20;
                }
            } else {
                totalTax = grossPay * 0.15;
            }
        } else {
            totalTax = grossPay * 0.10;
        }
        if (hasHealthInsurance) {
            totalTax -= 50;
        }
        // Ensure tax is not negative
        if (totalTax < 0) {
            totalTax = 0.0;
        }
        return totalTax;
    }
    // Method to process multiple employees and find statistics
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) {
        // Calculate pay for each employee
        // Find: highest paid employee, lowest paid employee, average pay
        // Count how many employees worked overtime (>40 hours)
        // Display results in a formatted table
        // Handle arrays of different lengths gracefully
        double weeklyPay, totalTax, netPay;
        String highestPaidName = "N/A";
        double highestPaidSalary = 0.0;
        String lowestPaidName = "N/A";
        double lowestPaidSalary = Double.MAX_VALUE;
        double averagePay = 0.0;
        int workedOvertimeCount = 0;
        System.out.printf("%-15s %-12s %-10s %-10s %-10s %-10s\n", "Name", "Type", "Hours", "Pay", "Tax", "Net");
        for (int employee = 0; employee < employeeTypes.length; employee++) {
            weeklyPay = calculateWeeklyPay(employeeTypes[employee], hours[employee], rates[employee]);
            totalTax = calculateTaxDeduction(weeklyPay, false);
            netPay = weeklyPay - totalTax;
            if (employeeTypes[employee].equals("FULL_TIME") && hours[employee] > 40) {
                workedOvertimeCount++;
            }
            if (netPay > highestPaidSalary) {
                highestPaidSalary = netPay;
                highestPaidName = names[employee];
            } else if (netPay < lowestPaidSalary) {
                lowestPaidSalary = netPay;
                lowestPaidName = names[employee];
            }
            System.out.printf("%-15s %-12s %-10.2f %-10.2f %-10.2f %-10.2f\n",
                    names[employee], employeeTypes[employee], hours[employee], weeklyPay, totalTax, netPay);
            averagePay += netPay;
        }
        if (employeeTypes.length > 0) {
            averagePay /= employeeTypes.length;
        }
        System.out.println("\n--- Payroll Summary ---");
        System.out.printf("Highest Paid: %s ($%.2f)\n", highestPaidName, highestPaidSalary);
        System.out.printf("Lowest Paid : %s ($%.2f)\n", lowestPaidName, lowestPaidSalary);
        System.out.printf("Average Net Pay: $%.2f\n", averagePay);
        System.out.printf("Employees with Overtime: %d\n", workedOvertimeCount);
    }
    public static void main(String[] args) {
        // Test data:
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        // Test individual calculations first
        System.out.println("Sample Calculation:");
        double pay = calculateWeeklyPay("FULL_TIME", 45, 25.0);
        double tax = calculateTaxDeduction(pay, false);
        System.out.printf("Weekly Pay: $%.2f | Tax: $%.2f | Net: $%.2f\n\n", pay, tax, pay - tax);

        // Process the full payroll
        System.out.println("Full Payroll Report:\n");
        processPayroll(types, hours, rates, names);
    }
}
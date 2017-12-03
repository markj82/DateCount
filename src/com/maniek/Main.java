package com.maniek;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.*;


public class Main {

    public static void main(String[] args) {

        // Calculate user age in days, weeks and years, based on what user enter...
        // Of course consider leap year

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth, starting with year: ");
        int year = scanner.nextInt();
        System.out.println("Now enter month: ");
        int month = scanner.nextInt();
        System.out.println("Now enter day: ");
        int day = scanner.nextInt();
        scanner.close();

        LocalDate todayDate = LocalDate.now();
        LocalDate birthdayDate = LocalDate.of(year, month, day);

        long yearsOfUser = ChronoUnit.YEARS.between(birthdayDate, todayDate);
        long weeksOfUser = ChronoUnit.WEEKS.between(birthdayDate, todayDate);
        long daysOfUser = ChronoUnit.DAYS.between(birthdayDate, todayDate);

        System.out.println("You live for " + yearsOfUser + " years, " + weeksOfUser + " weeks, and " + daysOfUser + " days.");

    }
}
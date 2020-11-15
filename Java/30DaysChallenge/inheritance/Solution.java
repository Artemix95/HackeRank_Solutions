package inheritance;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;


    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;

    }


    public double calculateAverage() {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        average = (double) sum / testScores.length;
        return average;
    }

    public char calculate() {
        if (calculateAverage() >= 90 && calculateAverage() <= 100) {
            return 'O';
        }
        if (calculateAverage() >= 80 && calculateAverage() < 90) {
            return 'E';
        }
        if (calculateAverage() >= 70 && calculateAverage() < 80) {
            return 'A';
        }
        if (calculateAverage() >= 55 && calculateAverage() < 70) {
            return 'P';
        }
        if (calculateAverage() >= 40 && calculateAverage() < 55) {
            return 'D';
        }
        if (calculateAverage()<40) {
            return 'T';
        }
        return '0';
    }

}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}


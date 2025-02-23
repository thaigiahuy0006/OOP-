package c4.c4_2;

public class TestPersonStudentStaff {
    public static void main(String[] args) {
        // Test Person
        Person person = new Person("Alice", "123 Main St");
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        person.setAddress("456 Oak St");
        System.out.println("Updated Address: " + person.getAddress());
        System.out.println(person.toString());

        // Test Student
        Student student = new Student("Bob", "789 Elm St", "Computer Science", 2024, 15000.00);
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());
        System.out.println("Fee: " + student.getFee());
        student.setProgram("Software Engineering");
        student.setYear(2025);
        student.setFee(16000.00);
        System.out.println("Updated Program: " + student.getProgram());
        System.out.println("Updated Year: " + student.getYear());
        System.out.println("Updated Fee: " + student.getFee());
        System.out.println(student.toString());

        // Test Staff
        Staff staff = new Staff("Charlie", "101 Maple St", "High School", 50000.00);
        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Pay: " + staff.getPay());
        staff.setSchool("Middle School");
        staff.setPay(52000.00);
        System.out.println("Updated School: " + staff.getSchool());
        System.out.println("Updated Pay: " + staff.getPay());
        System.out.println(staff.toString());
    }
}

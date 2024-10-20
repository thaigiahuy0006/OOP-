public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    // Thay đổi phương thức để nhận vào tỷ lệ phần trăm
    public int raiseSalary(int percent)
    {
        return this.salary=this.salary*10/100+this.salary;
    }

    // Phương thức mới để lấy tên đầy đủ
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public String toString() {
        return "Employee [id=" + id + ", Name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}

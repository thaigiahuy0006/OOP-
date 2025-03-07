package c4.c4_2;

public class Staff extends Person {
    public String school;
    public double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
    public double getPay() {
        return pay;
    }
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}
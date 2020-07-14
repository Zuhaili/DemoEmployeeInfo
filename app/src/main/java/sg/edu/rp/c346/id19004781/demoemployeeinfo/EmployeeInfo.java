package sg.edu.rp.c346.id19004781.demoemployeeinfo;

public class EmployeeInfo {
    private String name;
    private String title;
    private int salary;

    public EmployeeInfo(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name + " " + title + " " + salary;
    }
}

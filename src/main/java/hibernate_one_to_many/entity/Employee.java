package hibernate_one_to_many.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String firstname;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary")
    private int salary;

    public Employee() {
    }

    public Employee(String firstname, String surname, int salary) {
        this.firstname = firstname;
        this.surname = surname;
        this.salary = salary;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", id=" + id +
                '}';
    }


}

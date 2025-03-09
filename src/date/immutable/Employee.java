package date.immutable;

import java.util.Date;

final public class Employee {
    final private int id;
    final private String name;
    final private Date joiningDate;

    public Employee(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        //this.date = date;
        this.joiningDate=new Date(date.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getDate() {
        return joiningDate.getTime();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + joiningDate +
                '}';
    }
}

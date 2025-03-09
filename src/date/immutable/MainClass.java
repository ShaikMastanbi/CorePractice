package date.immutable;




import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        //we create date obj with fixed time stamp
        Date fixedDate = new Date(1700000000000L);


        Employee e=new Employee(1,"sai",fixedDate);

        System.out.println(e);


    }
}

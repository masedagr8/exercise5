import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what name");
        String name =  input.nextLine();
        System.out.println("what email");
        String email =  input.nextLine();
        Person person2 = new Person(name,email);
        List<Person>list= new ArrayList<>();
        Person person1 = new Person("Mason","076575");
        list.add(person1);
        list.add(person2);
        System.out.println(list);



    }



}
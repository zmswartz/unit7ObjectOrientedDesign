import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Person implements Comparable<Person>
{
    private String name;

    /**
     * Default constructor for objects of class Person
     */
    public Person(String n)
    {
        // initialise instance variables
        this.name = n;
    }
    
    public int compareTo(Person object)
    {
        return name.compareTo(object.name);
        
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 names: ");
        while(i < 10)
        {
            list.add(new Person(s.next()));
            i++;
        }
        
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        
        System.out.println(list.get(0) + " " + list.get(list.size()-1));
    }
    
    public String toString()
    {
        return name;
    }
}

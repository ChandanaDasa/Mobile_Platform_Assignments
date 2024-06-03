import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    public  Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    }
    public class LambdaExpression {
        public static void main(String args[]){
            List<Person> people=new ArrayList<>();
            people.add(new Person("Chandu",25 ));
            people.add(new Person("Keerthi", 20));
            people.add(new Person("Sandhya", 30));
            people.sort(Comparator.comparingInt(Person::getAge));
            System.out.println("Sorted by age:");
            for(Person person:people){
                System.out.println(person.getName() + "=" + person.getAge());
            }
        }

    }
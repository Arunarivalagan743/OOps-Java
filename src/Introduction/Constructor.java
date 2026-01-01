package Introduction;
class Person
{
    String name;
    int age;

    Person()
    {
        this("ak",89);//constructor from another constructor
    }
    Person(String  name,int age)
    {
        this.name =  name;
        this.age= age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Person p1 =  new Person();
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}

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
        Person p1 =  new Person(); //it creates a memory for the obejct for becuse new store complex data dynmaiclly stored in runtime
        System.out.println(p1.age);
        System.out.println(p1.name);

        Student s3 =  new Student();
        Student s4 =  s3;  //it just points to refrence of the s3 in heap.The s4 does not crets new mory and copy of s3
        s3.name = "arunak";
        System.out.println(s4.name);
    }
}

package Test2022.Test0407;

/**
 * Create with IntelliJ IDEA
 * Description:Cloneable 接口-》空接口，也是标志接口
 * 表示当前类可以被克隆
 * 调用此接口必须在类内重写clone();
 * User:Zyt
 * Date:2022-04-07
 */
class Money implements Cloneable{
    double m = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    String name;
    int age;
    public Money money = new Money();
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name) {
        this.name = name;
    }

    //对 money 进行深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person)super.clone();
        tmp.money = (Money)this.money.clone();
        return tmp;
    }
}

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("小明");
        person.age = 25;
        Person person1 = (Person)person.clone();
        System.out.println(person1.money.m);
        System.out.println("============");
        person1.age = 35;
        person1.money.m = 22.5;
        System.out.println(person.money.m);
        System.out.println(person1.money.m);
    }
}

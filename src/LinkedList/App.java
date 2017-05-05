package LinkedList;

public class App {

    public static void main(String[] args) {

        List<Person> list = new LinkedList<Person>();
        Person adam = new Person("Adam", 10);
        Person kevin = new Person("Kevin", 15);


        list.insert(adam);
        list.insert(kevin);


        System.out.println(list.size());

        list.traverseList();
    }
}

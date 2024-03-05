public class Application {
    public static void main(String[] args) {
        Student student = new Student("John", "12345");        //create object of type student
        //student.setName("John");                          //call method .setName(String name) for type student
        System.out.println(student.getName());
        //System.out.println(student);                        //print name of class & memory location, but when you use toString(), it tells us what's inside the object
    }
}

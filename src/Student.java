public class Student {
    public Student(String name){       //constructor for Student- java creates a default constructor even in the absence of you making one. We use them to pass arguments
        this.name = name;
    }
    private String name;
    public String getName(){
        return name;
    }

    // by default, java adds this. to the front of any variable
    /*
    Syntax explained:
    public  void    xxxxxxx(){}    #for when you return nothing
    public  String  xxxxxxx(){}     # for when you return string
    public  int     xxxxxxx(){}     # for when you return int
        etc...
     */


    /*
    public void setName(String name){
        this.name = name;
    }
    */

    @Override
    public String toString() {          //tells you all the information about an object, java makes one by default, but default only returns memory location
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

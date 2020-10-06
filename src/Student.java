    public class Student {

    String name;
    int age;


    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Carl");
        student.setAge(25);

        //System.out.println(student.getName());
        //System.out.println(student.getAge());
        //student.name = "Carl";
       // student.age = 25;

        student.printDetails();

        //System.out.println(student.name);
       //System.out.println(student.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void printDetails(){
        System.out.println(getName() + ", " + getAge());
   }
}
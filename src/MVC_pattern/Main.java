package MVC_pattern;

public class Main {
    public static void main(String[] args){
        Student m = retriveFromDatabase() ;
        StudentView v = new StudentView();
        StudentController sc = new StudentController(m,v);

        sc.updateView();
        sc.setName("Divya Roy");
        sc.setRollNo("17");

        sc.updateView();
    }

    private static Student retriveFromDatabase()
    {
        Student s = new Student();
        s.setName("Ishaa Das");
        s.setRollNo("24");
        return s;


    }
}

package MVC_pattern;

public class StudentController {
    private Student m;
    private StudentView v;

    public StudentController(Student m, StudentView v){
        this.m = m;
        this.v = v;
    }
    public void setName(String name){
        m.setName(name);
    }
    public String getName(){
        return m.getName();
    }
    public void setRollNo(String rollNo){
        m.setRollNo(rollNo);
    }
    public String getRollNo(){
        return m.getRollNo();
    }
    public void updateView(){
        v.studentDisplay(m.getName(),m.getRollNo());
    }

}

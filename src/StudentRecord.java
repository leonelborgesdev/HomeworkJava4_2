import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentRecord {
    private Map<String , Integer> studentMap;

    public StudentRecord(){
        studentMap=new HashMap<>();
    }
    public void addStudent(String name, int grade){
        studentMap.put(name,grade);
    }
    public void removeStudent(String name){
        studentMap.remove(name);
    }
    public Integer getGrade(String name){
        return  studentMap.get(name);
    }
    public  boolean isStudentInRecord(String name){
        return studentMap.containsKey(name);
    }
    public boolean isGradeInRecord(int grade){
        return studentMap.containsValue(grade);
    }
    public Set<String> getStudentNames(){
        return studentMap.keySet();
    }
}

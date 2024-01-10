import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentRecord studentRecord= new StudentRecord();

        studentRecord.addStudent("Juan", 85);
        studentRecord.addStudent("Maria", 90);
        studentRecord.addStudent("Pedro", 78);

        System.out.println("¿Esta Juan en el registro de alumnos?:"+studentRecord.isStudentInRecord("Juan"));
        System.out.println("¿Esta Ana en el registro de alumnos?:"+studentRecord.isStudentInRecord("Ana"));

        System.out.println("Calificacion de Pedro: "+ studentRecord.getGrade("Pedro"));

        studentRecord.removeStudent("Maria");
        System.out.println("¿Esta Maria en el registro de alumnos?:"+studentRecord.isStudentInRecord("Maria"));

        int calificacion=85;
        System.out.println("¿La calificacion "+calificacion+" esta en el registro?:"+studentRecord.isGradeInRecord(calificacion));
        Set<String> studentNames= studentRecord.getStudentNames();
        System.out.println("Nombres de los alumnos en el registro:");
        for (String name: studentNames){
            System.out.println(name);
        }

    }
}
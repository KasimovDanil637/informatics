package Informatics.itis;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.setFio("Михаил Сергеевич");
        student.setBirthDate("2000-01-01");
        student.setGender("M");
        student.setYear(2022);
        student.setGroup("11-200");
        teacher.setFio("Камиль Шамилевич");
        teacher.setBirthDate("2000-01-01");
        teacher.setGender("M");
        teacher.setPosition("Учитель");
        teacher.setCources("Информатика, База Данных");
        HTMLPersonWriter writer = new HTMLStudenWriter(student, "student.html");
        writer.print();
        writer = new HTMLTeacherWriter(teacher, "teacher.html");
        writer.print();
    }
}
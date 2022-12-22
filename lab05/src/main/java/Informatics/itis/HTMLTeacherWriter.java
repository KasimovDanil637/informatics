package Informatics.itis;

import java.io.FileWriter;
import java.io.IOException;


public class HTMLTeacherWriter extends HTMLPersonWriter {

    private Teacher teacher;

    public HTMLTeacherWriter(Teacher teacher, String fileName) {
        super(teacher, fileName);
        this.teacher = teacher;
    }

    protected void printAddedInfo(FileWriter writer) throws IOException {
        writer.write("<div>" + teacher.getPosition() + "</div>\n");
        writer.write("<div>" + teacher.getCources() + "</div>\n");
    }

}
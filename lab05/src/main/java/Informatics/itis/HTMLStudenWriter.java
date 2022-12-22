package Informatics.itis;

import java.io.FileWriter;
import java.io.IOException;

public class HTMLStudenWriter extends HTMLPersonWriter {

    private Student student;

    public HTMLStudenWriter(Student student, String fileName) {
        super(student, fileName);
        this.student = student;
    }

    protected void printAddedInfo(FileWriter writer) throws IOException {
        writer.write("<div>" + student.getGroup() + "</div>\n");
        writer.write("<div>" + student.getYear() + "</div>\n");
    }

}
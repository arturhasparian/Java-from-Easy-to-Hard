package com.javacode.javaio;

import collections.map.treemap.AverageStudentGrade;
import collections.map.treemap.SubjectGrade;
import collections.map.treemap.TreeMapRunner;

import java.io.IOException;
import java.util.*;

public class IOMain {

    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";
    private static final String BUFFERED_FILE = "Buffered.bin";


    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrade();

        Reader reader = new Reader();
        Writer writer = new Writer();
        FileUtils utils = new FileUtils();
        writer.writeFile(grades, FILE_NAME);
//        reader.readFile(FILE_NAME);
//        processGrades(grades, writer, BINARY_FILE);
//        outputObjects(reader, BINARY_FILE);
//        utils.printNIOFileDetails(FILE_NAME);
//        reader.readFileInFull(FILE_NAME);
//        reader.nioReadFileWithBuffer(FILE_NAME);
//        writer.nioWriterWithBuffer(BUFFERED_FILE);
//        reader.nioReadWithStream(FILE_NAME);
//        writer.nioWriteWithStream(BUFFERED_FILE);
//        reader.nioReadWithChannel(FILE_NAME);
//        writer.nioWriteWithChannel(BUFFERED_FILE);
//        writer.writeWithRandomAccess(FILE_NAME);
        utils.processDir();
    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName) {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);
    }

    private static void outputObjects(Reader reader, String fileName) {
        List<Student> students = reader.readObject(fileName);
        for (Student student : students) {
            System.out.printf("%s, %.2f, %n", student.getName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }


}

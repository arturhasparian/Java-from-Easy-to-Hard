package com.javacode.javaio;

import collections.map.treemap.AverageStudentGrade;
import collections.map.treemap.SubjectGrade;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Writer {

    public void writerWithFormatter() throws FileNotFoundException {
        Formatter formatter = new Formatter("BankAccounts.txt");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Please enter clientID, clientName, clientSurname, account balance");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d, %s, %s, %.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input incorrect. Please try again " + e.getMessage());
                scanner.nextLine();
            }
        }
        formatter.close();
    }

    public void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("=================================================================\n");
                writer.write("Student: " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");
                }
            }
        }
    }

    public void writeObject(List<Student> students, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {

            for (Student student : students) {
                out.writeObject(student);
            }
            out.writeObject(new Student("", -1, null));

        } catch (IOException e) {
            System.out.println("File cannot be opened. Program terminates");
            e.printStackTrace();
        }
    }

    public void nioWriterWithBuffer(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Charset charset = Charset.forName("UTF-8");
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
            writer.write(fileName, 0, fileName.length());
        }
    }

    public void nioWriteWithStream(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        String string = "File cannot be opened. Program terminates";
        byte[] bytes = string.getBytes();
        try (OutputStream stream = Files.newOutputStream(path, CREATE, APPEND)) {
            stream.write(bytes, 0, bytes.length);
        }
    }

    public void nioWriteWithChannel(String fileName) throws IOException {
        String str = "You can also create a new file by using the newOutputStream methods," +
                " as described in Creating and Writing a File using Stream I/O. " +
                "If you open a new output stream and close it immediately, an empty file is created.";
        RandomAccessFile file = new RandomAccessFile(fileName, "rw");
        FileChannel channel = file.getChannel();
        byte[] bytes = str.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        channel.write(buffer);
        channel.close();

    }

    public void writeWithRandomAccess(String fileName) throws IOException {
        ByteBuffer mark = ByteBuffer.wrap(" MARKET AREA ".getBytes());

        ByteBuffer buffer = ByteBuffer.allocate(10);

        Path path = Paths.get(fileName);

        try (FileChannel openFile = FileChannel.open(path, READ, WRITE)) {
            int numBytes = 0;
            while (buffer.hasRemaining() && numBytes != -1) {
                numBytes = openFile.read(buffer);
            }
            openFile.position(0);
            openFile.write(mark);
            long size = openFile.size();
            openFile.position(size/2);
            mark.rewind();
            openFile.write(mark);
            openFile.position(size - 1);
            mark.rewind();
            openFile.write(mark);
            buffer.rewind();
            openFile.write(buffer);
        }
    }

}

package Lab1.Ex2;

import java.util.LinkedList;
import java.util.List;

public class  University {
    String name;
    String fundationYear;
    List<student> studentList;

    public University(String name, String fundationYear) {
        this.name = name;
        this.fundationYear = fundationYear;
        this.studentList = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", fundationYear='" + fundationYear + '\'' +
                '}';
    }
}

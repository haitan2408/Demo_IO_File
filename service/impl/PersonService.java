package com.company.character_file.service.impl;

import com.company.character_file.model.Person;
import com.company.character_file.model.Student;
import com.company.character_file.model.Teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {
    private static final String PERSON_CSV = "src/com/company/character_file/data/person.csv";
    private Scanner scanner = new Scanner(System.in);

    public List<Person> getAll() {
        List<Person> personList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(PERSON_CSV);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                if (temp.length == 5) {
                    personList.add(new Student(temp[0], Integer.parseInt(temp[1]), temp[2], temp[3], Double.parseDouble(temp[4])));
                } else if (temp.length == 4) {
                    personList.add(new Teacher(temp[0], Integer.parseInt(temp[1]), temp[2], temp[3]));
                }
            }
            reader.close();
            return personList;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Đọc file lỗi");
        }
        return null;
    }

    public void showAll(List<Person> people) {
        for (Person person : people) {
            if (person instanceof Student)
                System.out.println("Student: " + person);
            else {
                System.out.println("Teacher: " + person);
            }
        }
    }
}

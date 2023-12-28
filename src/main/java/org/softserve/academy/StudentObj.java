package org.softserve.academy;

import java.util.Objects;

public class StudentObj {
    private String name;
    private int age;
    public static int count = 0;
    public StudentObj() {
        count++;
    }
    public StudentObj(String name) {
        this.name = name;
        count++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentObj that = (StudentObj) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "StudentObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public StudentObj(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    //getters, setters, methods
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    static class StudentDemo{
        public static void main(String[] args) {
            StudentObj student1 = new StudentObj();
            student1.setName("Alice");
            student1.setAge(18);
            StudentObj student2 = new StudentObj("Bob");
            student2.setAge(22);
            StudentObj student3 = new StudentObj("Carla",25);
            System.out.println("Students:");
            System.out.println(student1);
            System.out.println(student1.getName()+ " " +student1.getAge());
            System.out.println(student2.getName()+ " " +student2.getAge());
            System.out.println(student3.getName()+ " " +student3.getAge());
            System.out.println("Counts of students is: " + StudentObj.count);
        }
    }

}

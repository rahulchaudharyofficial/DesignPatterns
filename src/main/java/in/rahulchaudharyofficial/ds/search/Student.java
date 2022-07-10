package in.rahulchaudharyofficial.ds.search;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;
    private int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

	@Override
	public int compareTo(Student o) {
		if(this.getRollNumber() == o.getRollNumber())
            return 0;
        else if(this.getRollNumber() < o.getRollNumber())
            return -1;
        else
            return 1;
	}
}

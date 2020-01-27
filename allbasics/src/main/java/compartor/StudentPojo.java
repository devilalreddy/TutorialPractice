package compartor;

import java.util.Comparator;

public class StudentPojo implements Comparator<StudentPojo> {
    private Integer rollNumber;
    private String name;
    private String address;

    StudentPojo() {

    }

    public StudentPojo(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getRollNumber() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compare(StudentPojo studentPojo, StudentPojo t1) {

        int compareRollNumber = studentPojo.getRollNumber().compareTo(t1.getRollNumber());
        int compareName = studentPojo.getName().compareTo(t1.getName());

        if (compareName ==0) {
            return ((compareRollNumber == 0) ? compareName: compareRollNumber);
        }
        else
        return compareName;
    }
}

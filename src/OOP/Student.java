package OOP;

public class Student {
    public String name; // cac thuoc tinh
    protected String email;
    public int age;
    public String gender;
    protected String phoneNumber;
   public Student() {} // ham tao khong tham so

    public Student(String name, String email, int age, String gender, String phoneNumber) { // ham tao day du tham so
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
}

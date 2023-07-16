package OOP;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Student st = new Student("vu van tien","tienvv1313@gmail.com",22,"male","0378664091");
        student.name = "vu van tien";
        student.age = 22;
        student.gender = "male";
        student.phoneNumber = "0378664091";
        System.out.println("ten: " + student.name + ", tuoi: " + student.age + ", gioi tinh: " + student.gender +
                ", so dien thoai: " + student.phoneNumber);
        System.out.println(st.name + st.email);
    }
}

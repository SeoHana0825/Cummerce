package Step3;

public class Customer {

    // 속성
    String name;
    String email;
    String address;
    String grade;

    // 생성자 (객체 생성)
    public Customer (String name, String email, String grade) {
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    // 메서드 (기능) 1. getter
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getGrade() {
        return grade;
    }

    // 메서드 (기능) 2. setter
    public void setName(String name) {
    }
    public void setEmail(String email) {
    }
    public void setAddress(String address) {
    }
    public void setGrade(String grade) {
    }
}

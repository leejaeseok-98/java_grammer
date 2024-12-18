package C05AnoymousLanbda;

public class Student {
    String name = "";
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "이름은 "+ this.name + " 나이는 " + this.age;
    }
}

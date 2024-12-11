package C02ClassBasic;

public class C0202Person {
//    privare 접근제어자는 해당 클래스내에서만 접근 가능
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public void setEmail(String email){
//        this.email = email;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
//    public String getEmail(){
//        return this.email;
//    }











    public void eating(String name){
        this.name = name;
        System.out.println(this.name + "님이 밥을 먹고 있습니다.");
    }
    public String whoIs(String name,int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
        String result = "이름은 : " + this.name + "나이는 : " + this.age + "email : " + this.email;
        return result;
    }

}

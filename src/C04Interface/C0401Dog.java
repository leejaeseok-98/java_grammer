package C04Interface;

import java.sql.SQLOutput;

public class C0401Dog implements C0401AnimallInterface1{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class C0401DogMultiImpl implements C0401AnimallInterface1,C0401AnimallInterface2{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public String play(String a, String b) {
        return a+"와 " + b + "서로 산책을 합니다.";
    }
}
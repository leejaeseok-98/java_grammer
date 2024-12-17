package C03inheritance;

import java.util.List;

public class C03050thers {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();

//        추상클래스는 별도의 구현없이 객체생성 불가
//        AbstractAnimal a1 = new AbstractAnimal();
//        List<Integer> list1 = new List<Integer>();
    }

}
//abstract메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드가 붙어야함
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물소리를 냅니다.");
    }
//    리턴타입과 매개변수만 있는 선언만 존재.
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal{
//abstract클래스를 상속받을때에는 overriding이 강제됨
    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}
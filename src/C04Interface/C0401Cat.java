package C04Interface;

public class C0401Cat implements C0401AnimallInterface1{
    @Override
    public void makeSound() {
        System.out.println("야옹 야옹");
    }
}

class  c0401CatMultiImpl implements C0401AnimallInterface1,C0401AnimallInterface2{

    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }

    @Override
    public String play(String a, String b) {
        return a+"와 " + b + "서로 그루밍을 합니다.";
    }
}
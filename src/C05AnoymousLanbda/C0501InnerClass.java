package C05AnoymousLanbda;

public class C0501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass mi = new MemberInnerClass();
        mi.display();

        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();
        si.display();
    }
}
//일반 내부 클래스
class  MemberInnerClass{
    int a;
    void display(){
        System.out.println("a의 값은"+ this.a);
    }
//   static내부클래스 : 밖의 memberInnerClass의 static변수처럼 활용
    static class StaticInnerClass{
        int b = 10;
        void display(){
            System.out.println("b의값은" + this.b);
        }
    }
}
package practice.recurcombipermu;

import java.util.ArrayList;
import java.util.List;

public class Combi2 {
    public static void main(String[] args) {
        //        재귀함수 호출을 통한 조합리스트 만들기
        int count;
        int start;
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> mylist = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);

        combi(answer,mylist,temp,2,0);
        System.out.println(answer);
    }
    public static void combi(List<List<Integer>>answer,List<Integer>mylist,List<Integer>temp,int count,int start){
        if (count == temp.size()){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i =start;i<mylist.size();i++){
            temp.add(mylist.get(i));
            combi(answer,mylist,temp,count,i+1);
            temp.remove(temp.size()-1);//백트레킹
        }
    }
}

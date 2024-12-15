package practice.recurcombipermu;

import java.util.ArrayList;
import java.util.List;

public class Combi {
    public static void main(String[] args) {
        //        재귀함수 호출을 통한 조합리스트 만들기
        List<Integer> mylist = new ArrayList<>(); //요소를 담기 위한 리스트
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        List<List<Integer>> answer = new ArrayList<>(); //이중리스트로 조합을 담기위한 리스트
        List<Integer> temp = new ArrayList<>(); //조합 요소를 담기 위한 리스트
        combi(answer,temp,mylist,2,0);//재귀함수 호출
        System.out.println(answer);//조합 출력
    }
    public static void combi(List<List<Integer>> answer, List<Integer> temp,List<Integer>mylist,int count,int start){
        if (count==temp.size()){//두자리 넣을꺼니까 temp.size와 비교해야함
            answer.add(new ArrayList<>(temp));// temp.size가 2이면, 즉 temp의 규모가 3이면 answer에 temp를 넣는다.
            return;
        }
        for (int i = start;i<mylist.size();i++){ //
            temp.add(mylist.get(i));
            combi(answer,temp,mylist,count,i+1);
            temp.remove(temp.size()-1);
        }
    }

}

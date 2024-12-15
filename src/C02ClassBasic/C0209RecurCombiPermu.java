package C02ClassBasic;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
//        숫자가 1,2,3,4가 있을 때
//        List<Integer>mylist = new ArrayList<>();
//        mylist.add(1);
//        mylist.add(2);
//        mylist.add(3);
//        mylist.add(4);
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer>temp = new ArrayList<>();
//       for (int i = 0; i < mylist.size();i++){
//               temp.add(mylist.get(i));
//           for (int j =i+1;j<mylist.size();j++){
//               temp.add(mylist.get(j));
//               answer.add(new ArrayList<>());
//               temp.remove(temp.size()-1);
//           }
//           temp.remove(temp.size()-1);
//       }
//        System.out.println(answer);

//        재귀함수 호출을 통한 조합리스트 만들기
        List<Integer>mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//        combi(answer,temp,mylist,2,0);
        boolean[] booleans = new boolean[mylist.size()];
        answer = new ArrayList<>();
        permu(answer,temp,mylist,2, new boolean[mylist.size()]);
        System.out.println(answer);

    }

    public static void combi(List<List<Integer>> answer, List<Integer> temp,List<Integer>mylist,int count,int start){
        if (count==temp.size()){//두자리 넣을꺼니까 temp.size와 비교해야함
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start;i<mylist.size();i++){
               temp.add(mylist.get(i));
               combi(answer,temp,mylist,count,i+1);
               temp.remove(temp.size()-1);
           }
    }

    public static void permu(List<List<Integer>> answer, List<Integer> temp,List<Integer>mylist,int count,boolean[] visit){
        if (count==temp.size()){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0;i<mylist.size();i++){
            if (!visit[i]){
                visit[i] = true;
                temp.add(mylist.get(i));
                permu(answer,temp,mylist,count,visit);
                temp.remove(temp.size()-1);
                visit[i] = false;
            }
        }
    }

//    n과 m(1) 15 : 백준
//    로또 6603



}

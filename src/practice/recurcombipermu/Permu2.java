package practice.recurcombipermu;

import java.util.*;

public class Permu2 {
    public static void main(String[] args) {
       List<List<Integer>>answer = new ArrayList<>();
       List<Integer>myList = new ArrayList<>();
       List<Integer>temp = new ArrayList<>();
       myList.add(1);
       myList.add(2);
       myList.add(3);
       myList.add(4);
       boolean[] visit = new boolean[myList.size()];
       answer = new ArrayList<>();
       permu(answer,myList,temp,2, new boolean[myList.size()]);
        System.out.println(answer);
    }
    public static void permu(List<List<Integer>>answer,List<Integer>myList,List<Integer>temp,int count,boolean[] visit){
        if (count == temp.size()){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0;i<myList.size();i++){
            if (!visit[i]){
                visit[i] = true;
                temp.add(myList.get(i));
                permu(answer, myList, temp, count, visit);
                temp.remove(temp.size()-1);
                visit[i] = false;
        }
            }
    }
}

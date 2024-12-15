package practice.recurcombipermu;

import java.util.ArrayList;
import java.util.List;

public class Permu {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] booleans = new boolean[mylist.size()];
        answer = new ArrayList<>();
        permu(answer,temp,mylist,2, new boolean[mylist.size()]);
        System.out.println(answer);
    }

    public static void permu(List<List<Integer>> answer, List<Integer> temp,List<Integer>mylist,int count,boolean[] visit) {
        if (count == temp.size()) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < mylist.size(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                temp.add(mylist.get(i));
                permu(answer, temp, mylist, count, visit);
                temp.remove(temp.size() - 1);
                visit[i] = false;
            }
        }
    }
}

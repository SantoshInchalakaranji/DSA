package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> pascal = new ArrayList<List<Integer>>();
        ArrayList<Integer> previousList = new ArrayList<Integer>();
       

        previousList.add(1);
        pascal.add(previousList);
        int element;

        for(int i = 1; i< numRows; i++){
             ArrayList<Integer> newList = new ArrayList<Integer>();

            for(int j = 0; j<=i;j++){
                if(j==0 || j==i){
                    newList.add(1);
                }else{
                   
                    element = previousList.get(j-1)  + previousList.get(j);
                    newList.add(element);
                }
            }
            
            pascal.add(newList);
            previousList = new ArrayList<Integer>(newList);
        }
        return pascal;
    }
}

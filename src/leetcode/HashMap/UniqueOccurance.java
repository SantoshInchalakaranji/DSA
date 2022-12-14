package leetcode.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Problem:Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
public class UniqueOccurance{
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
           
           for(int i= 0;i<arr.length;i++){
             if(map.containsKey(arr[i])){
                 map.put(arr[i], map.get(arr[i])+1);
             }else
                 map.put(arr[i],1);
           }
           Set<Integer> set = new HashSet<>(map.values());
           if(set.size()==map.size())
               return true;
           else
               return false;
       }
}

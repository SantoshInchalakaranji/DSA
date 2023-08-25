package leetcode.String;

import java.util.HashMap;
import java.util.Map;




//

public class CharacterFrequency {
    public String frequencySort(String s) {
       Map<Character, Integer> map = new HashMap<>();
      
        /// add values to map
        for(char c : s.toCharArray()){
            map.merge(c,1, Integer::sum);
        }
      
        //// get heightest value from map and create the required string
        String ans="";
        while(!map.isEmpty()){ 
              int max =0;
               Character ch = null;
            for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue()>max){
                max = e.getValue();
                ch =    e.getKey();
            }
        }
            for(int j =max; j>0;j--){
                ans = ans + String.valueOf(ch);
            }
            map.remove(ch);
         
        }
        return ans;
    }
}


// public String frequencySort(String s) {
//     if (s.length() < 3) return s;

//     StringBuilder sb = new StringBuilder();
//     Map<Character, Integer> map = new HashMap<>();
//     for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);

//       map.entrySet().stream()
// .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
// .forEach(entry -> {
//     for (int i = 0; i < entry.getValue(); i++) {
//         sb.append(entry.getKey());
//     }
// });

// return sb.toString();
// }

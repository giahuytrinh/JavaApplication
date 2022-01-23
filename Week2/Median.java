import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.io.*;
import java.util.*;

class Median{
 public static void main(String[] args){
  /*
  HashSet<String> hashSet = new HashSet<>();
  for (String s: args){
   hashSet.add(s);
  }

  TreeSet<String> treeSet = new TreeSet<>(hashSet);
  System.out.println("TreeSet: " + treeSet);  
  */

  ArrayList<Double> array = new ArrayList<>();
  for (String s: args){
   array.add(Double.parseDouble(s));
  }
  Collections.sort(array);
  //System.out.println("array: " + array);
  

  if(array.size()% 2 == 0){
   System.out.println("Median: "+(array.get(array.size()/2-1)+ array.get(array.size()/2))/2);
  }else{
   System.out.println("Median: "+ array.get((array.size()-1)/2));
  }

  /*
  for(String s : hashSet) {
   System.out.print(" " + s);
  }		
  System.out.println();
  */

  /*
  Iterator<String> it = HashSet.iterator();
  while(it.hasNext()){
   System.out.println("Sets: ",Arrays.toString(it.next()));
  }*/

 }
}

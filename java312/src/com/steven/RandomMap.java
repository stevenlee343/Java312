package com.steven;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class RandomMap {
 public static void main(String[] args) {
	 
 Random rand = new Random();
 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
 
 for(int i = 0; i < 10000; i++) {    
	 
 int r = rand.nextInt(20);
 Integer freq = map.get(r);
 
 if(freq == null) {
	 map.put(r, 1);
 }else {
	 map.put(r, freq+1);
 }

  }
 System.out.println(map);
 
 }
 
}
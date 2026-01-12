package Hashmap;
import java.util.*;
public class Sort_By_Frequency {
    static class Word implements Comparable<Word>{
        Character x;
        int freq;

        public Word(Character x,int freq){
            this.x=x;
            this.freq=freq;
        }

        @Override
        public int compareTo(Word s2){
            return s2.freq - this.freq;
        }
    }
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String s="tree";
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        Set<Character> keys=map.keySet();
        PriorityQueue<Word> pq=new PriorityQueue<>();
        for (Character key : keys) { 
            pq.add(new Word(key, map.get(key)));
        }
        while(!pq.isEmpty()){
            Word w = pq.remove();
            for(int i=0;i<w.freq;i++){
                System.out.print(w.x);
            }
        }
    }
}

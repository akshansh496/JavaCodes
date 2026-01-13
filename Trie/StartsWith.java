package Trie;

public class StartsWith {
    static class Node{
        Node Children[]=new Node[26];
        boolean EndOfWord=false;
        
        Node(){
            for(int i=0;i<26;i++){
                Children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null){
                curr.Children[idx]=new Node();
            }
            curr=curr.Children[idx];
        }
        curr.EndOfWord=true;
    }

    public static boolean search(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null) return false;
            curr=curr.Children[idx];
        }
        return true;
    }
        
    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        for(String word: words){
            insert(word);
        }
        System.out.println(search("apn"));
    }
}

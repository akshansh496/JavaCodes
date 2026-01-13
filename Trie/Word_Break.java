package Trie;

public class Word_Break {
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

    public static void insert(String word){//O(L) L-length of largest word
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
        return curr.EndOfWord==true;
    }

    public static boolean word(String key){
        if(key.length() == 0) return true;

        for(int i=1; i<=key.length(); i++){
            String first = key.substring(0, i);
            String second = key.substring(i);

            if(search(first) && word(second)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for(String word: words){
            insert(word);
        }
        String key="ilikesamsung";
        System.out.println(word(key));
        
    }
}

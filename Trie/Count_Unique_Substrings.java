package Trie;

// Unique substrings= all unique prefix of all suffix
// unique prefixes in a trie are equal to no. of nodes in that trie
public class Count_Unique_Substrings {
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

    static int count=0;
    public static void insert(String word){//O(L) L-length of largest word
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.Children[idx]==null){
                curr.Children[idx]=new Node();
                count++;//counting the no. of nodes
            }
            curr=curr.Children[idx];
        }
        curr.EndOfWord=true;
    }
    public static void main(String[] args) {
        String str="apple";
        //inserting all suffixes to trie
        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }
        System.out.println(count+1);
    }
}

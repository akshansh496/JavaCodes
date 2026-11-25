package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Word_Ladder_2 {

    static List<List<String>> ans = new ArrayList<>();

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return new ArrayList<>();
        }
        set.remove(beginWord);
        List<String> list = new ArrayList<>();
        list.add(beginWord);
        int n = ladderLength(beginWord, endWord, wordList);
        if (n == 0) {
            return new ArrayList<>();
        }
        helper(beginWord, endWord, set, list, n);
        return ans;
    }

    public static void helper(String beginWord, String endWord, Set<String> set, List<String> list, int n) {
        if (beginWord.equals(endWord)) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (list.size() == n) {
            return;
        }
        StringBuilder str = new StringBuilder(beginWord);
        for (int i = 0; i < beginWord.length(); i++) {
            char originalChar = str.charAt(i);
            for (char x = 'a'; x <= 'z'; x++) {
                str.setCharAt(i, x);
                String neighbour = str.toString();
                if (set.contains(neighbour)) {
                    set.remove(neighbour);
                    list.add(neighbour);
                    helper(neighbour, endWord, set, list, n);
                    list.remove(list.size() - 1);
                    set.add(neighbour);
                }
            }
            str.setCharAt(i, originalChar);
        }
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        set.remove(beginWord);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                String word = q.poll();
                if (word.equals(endWord)) {
                    return level;
                }
                StringBuilder str = new StringBuilder(word);
                for (int i = 0; i < word.length(); i++) {
                    char originalChar = str.charAt(i);
                    for (char x = 'a'; x <= 'z'; x++) {
                        str.setCharAt(i, x);
                        String neighbour = str.toString();

                        if (set.contains(neighbour)) {
                            q.add(neighbour);
                            set.remove(neighbour);
                        }
                    }
                    str.setCharAt(i, originalChar);
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        List<List<String>> result = findLadders(beginWord, endWord, wordList);

        for (List<String> path : result) {
            System.out.println(path);
        }
    }
}

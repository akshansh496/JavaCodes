package Heap;

import java.util.ArrayList;

public class Min_Heap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            // add at last idx
            arr.add(data);

            int x=arr.size()-1;//child idx
            int par=(x-1)/2;//parent idx

            // formula
            // left child=(parentIdx*2)+1
            // right child=(parentIdx*2)+2

            // parent=(childIdx-1)/2

            while(arr.get(x)<arr.get(par)){
                //  swap
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){ //O(log n)
            // take out left node and right node check which is the smallest among root,left and right.If left or
            //  right is smaller swap it wirth root and do it recursively to check lower levels

            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }

            if(minIdx!=i){
                // swap
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            // firstly swap first and the last node and then delete last node now check if the tree is still valid by heapify

            int data=arr.get(0);

            // swap 1st and last
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // delete last
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h .add(4);
        h .add(1);
        h .add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}

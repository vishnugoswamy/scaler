public class Solution {
    
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> minHeap = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if (A.get(i).get(0) == 2) {
                insertInHeap(minHeap, A.get(i).get(1));
            } else {
                extractFromHeap(minHeap, results);
            }
        }
        return results;
    }
        static void extractFromHeap(ArrayList<Integer> heap, ArrayList<Integer>results){
        if(!heap.isEmpty()){
            swap(heap,0,heap.size()-1);//Swap 0th index, which is the minimum in minHeap to the last index so that it can be extracted
            results.add(heap.remove(heap.size()-1));
            downHeapify(heap,0);
        }else {
            results.add(-1);
        }
    }
    static void downHeapify(ArrayList<Integer>heap,int i){
        int N = heap.size();
        int leftChild = 2 i + 1;
        int rightChild = 2 i + 2;
        while (leftChild<N){ // only checking Lc because a Rc cannot exist with a Lc since heap is a Complete Binary Tree
            if(rightChild == N) { //only Lc exists
                if(heap.get(i)>heap.get(leftChild)) swap(heap,leftChild,i);
                break;
            }
            //if both Lc & Rc exists
            if(heap.get(i)>heap.get(leftChild) || heap.get(i)>heap.get(rightChild)){
                int min = heap.get(leftChild) < heap.get(rightChild) ? leftChild : rightChild;
                swap(heap,min,i);//Swap with min of Lc & Rc
                i = min;
                leftChild = 2 i + 1;
                rightChild = 2 i + 2;
            }
            else{
                break;
            }
        }
    }
    static void insertInHeap(ArrayList<Integer> heap, int value) {
        heap.add(value);
        upHeapify(heap, heap.size() - 1);
    }
    static void upHeapify(ArrayList<Integer> heap, int index){
        int parentIndex = (index-1)/2;
        while (index!=0 && heap.get(parentIndex)>heap.get(index)){
            swap(heap, index, parentIndex);
            index = parentIndex;
            parentIndex = (index-1)/2;
        }
    }
    static void swap(ArrayList<Integer>heap,int val1,int val2){
        int temp = heap.get(val1);
        heap.set(val1, heap.get(val2));
        heap.set(val2, temp);
    }
}

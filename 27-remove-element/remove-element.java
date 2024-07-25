class Solution {
    public int removeElement(int[] arr, int val) {
        //move val at end of the array 
        int valuePointer = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==val) {
                valuePointer = i;
                break;
            }
        }
        for(int i = valuePointer; i < arr.length; i++) {
            if(arr[i]!=val) {
                int temp = arr[i];
                arr[i] = arr[valuePointer];
                arr[valuePointer] = temp;
                valuePointer++;
            }
        }
        return valuePointer;
    }
}
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] isPresent = new int[A.length+1];
        int[] result = new int[A.length];
        int count= 0;
        for (int i = 0 ; i < A.length; i++) {
            isPresent[A[i]]++;
            if (isPresent[A[i]]==2) count++;
            isPresent[B[i]]++;
            if(isPresent[B[i]]==2) count++;
            result[i] = count;
        }

        return result;
        
    }
}
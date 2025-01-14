class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> isPresent = new HashMap<>();
        int[] result = new int[A.length];
        int count= 0;
        for (int i = 0 ; i < A.length; i++) {
            isPresent.put(A[i],isPresent.getOrDefault(A[i],0)+1);
            if (isPresent.get(A[i])==2) count++;
            isPresent.put(B[i],isPresent.getOrDefault(B[i],0)+1);
            if(isPresent.get(B[i])==2) count++;
            result[i] = count;
        }

        return result;
        
    }
}
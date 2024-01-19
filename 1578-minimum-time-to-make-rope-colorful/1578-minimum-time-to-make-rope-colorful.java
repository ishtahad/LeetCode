class Solution {
    public int minCost(String colors, int[] neededTime) {  
        int time = 0;
        int i =0 ;
        int j = 1;
        while(i <colors.length()-1 && j < colors.length()){
            if(colors.charAt(i) == colors.charAt(j)){
                int index = i;
                if(neededTime[i] > neededTime[j]){
                       index= j;
                }
                time = time + neededTime[index];
                if(index == i) {
                    i = j;
                    j = i+1;
                }else{
                    j++;
                } 
            }else{
                i=j;
                j = i+1;
            } 
        }
        return time;
    }
}
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int length = heights.length -1;
        for(int i = 0; i< length; i++){
            int difference = heights[i+1] - heights[i];
            if(difference <= 0)continue;
            bricks -= difference;
            queue.offer(difference);
            if(bricks < 0){
                bricks += queue.poll();
                if(ladders > 0){
                    ladders--;
                }else{
                    return i;
                }
            }
            
        }
        return length;
    }
}
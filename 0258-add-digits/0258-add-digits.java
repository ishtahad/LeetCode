class Solution {
    public int addDigits(int num) {
        int result = 0;
        if(num <= 9){
            return num;
        }
        while(num > 9){
            result = 0;
            while(num > 0){
                 result += num % 10 ;
                 num = num / 10;
            }
            
            if(num == 0){
               num = result;
            }
            
        }
        return result;
    }
}
class Solution {
    public int minOperations(String s) {
        char ch = s.charAt(0);
        int step = count(s,ch);
        int step1 = count(s,ch=='0'? '1':'0');
        return Math.min(step,step1+1);
    }

    private int count(String s, char previous){
        int step = 0;
        for(int i = 1; i < s.length();i++ ){
            char current = s.charAt(i);
            if( current == previous){
                step++;
                previous = (previous == '0' ? '1' : '0');
            }else{
                previous = current;
            }
        }
        return step;
    }
}
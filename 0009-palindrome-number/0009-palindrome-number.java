class Solution {
    public boolean isPalindrome(int x) {
        String str =Integer.toString(x);
       StringBuilder input1 = new StringBuilder();
        StringBuilder input2 = new StringBuilder();
         StringBuilder input3 = new StringBuilder();
        input1.append(str);
        input3.append(str);
        input2 = input3.reverse();
        if(input1.toString().equals(input2.toString())){
            return true;
        }else{
            return false;
        }
        
    }
}
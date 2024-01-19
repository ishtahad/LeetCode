class Solution {
    public int reverse(int x) {
      String str =Integer.toString(x);
        char[] ch = str.toCharArray(); 
       
        StringBuilder input1 = new StringBuilder();
        StringBuilder input2 = new StringBuilder();
        //input1.append(str);
        //input1 = input1.reverse();
       for(int i= 0; i<ch.length ;i++){
           if(ch[i] == '-'){
                continue;
           }
           if(i == ch.length-1){
               if(ch[ch.length - 1] == '0'){
               continue;
           }
           
           }
           
           input1.append(ch[i]);
       } 
       input2.append(input1);
        if(ch[0] == '-'){
                input2.append('-');
           }
        
        input2 = input2.reverse();
        str = input2.toString();
       int ans = 0;
      try{
             if(str.isEmpty()){
             
             ans = 0; 
        }else{
             ans = Integer.parseInt(str); 
        }
        }
        catch(Exception e ){
            ans = 0;
            
        }
        return ans;
        
    }
}
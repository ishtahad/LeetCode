class Solution {
    public String countAndSay(int n) {
       StringBuilder previous = new StringBuilder();
         previous.append("1");
         StringBuilder result = new StringBuilder();
        if(n == 1){
             result.append("1");
        }
        for(int z = 2 ; z<=n ;z++){
             result = new StringBuilder();
                    for(int i = 0; i < previous.length() ;i++){
                           int count = 1;
                           for( int y = i+1 ;y < previous.length();y++){
                                   if(previous.charAt(i) == previous.charAt(y)){
                                           count = count + 1;
                                           i = i+1;
                                    }
                                    else{
                                        break;
                                    }
                           }
                                    result.append(Integer.toString(count));
                                    result.append(previous.charAt(i));
                    }
            previous = new StringBuilder();
            previous.append(result);
                    
        }
                   
        return result.toString();
        
     
    }
}
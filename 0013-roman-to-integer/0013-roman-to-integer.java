class Solution {
    public int romanToInt(String s) {
       int amount = 0;
        for(int i = 0; i < s.length() ; i++){
           if(s.charAt(i) == 'I'){
              if(i == s.length() -1){
                  amount = amount + 1;
                  break;
              }else{
                   if(s.charAt(i+1)=='V'){
                   amount = amount + 5 -1;
                   i++;
                   
                   continue;
               }else if(s.charAt(i+1)=='X'){
                    amount = amount + 10 -1;
                   i++;
                  
                   continue;
               }
               else{
                
                    amount = amount + 1;
               }
              }
              
              
              
           }else if(s.charAt(i) == 'V'){
               amount = amount + 5;
           }else if(s.charAt(i) == 'X'){
               if(i == s.length() -1){
                  amount = amount + 10;
                  break;
              }else{
               if(s.charAt(i+1)=='L'){
                   amount = amount + 40;
                   i++;
                   continue;
               }else if(s.charAt(i+1)=='C'){
                    amount = amount + 90;
                   i++;
                   continue;
               }
               else{
                   amount = amount + 10;
               }
              }
              
           }else if(s.charAt(i) == 'L'){
               amount = amount + 50;
           }else if(s.charAt(i) == 'C'){
               if(i == s.length() -1){
                  amount = amount + 100;
                  break;
              }else{
               if(s.charAt(i+1)=='D'){
                   amount = amount + 400;
                   i++;
                   continue;
               }else if(s.charAt(i+1)=='M'){
                    amount = amount + 900;
                   i++;
                   continue;
               }
               else{
                    amount = amount + 100;
               }
              }
              
           }else if(s.charAt(i) == 'D'){
               amount = amount + 500;
           }else if(s.charAt(i) == 'M'){
               amount = amount + 1000;
           }
            
        }
       // System.out.println(amount);
        
        return amount;
    }
        
    
}
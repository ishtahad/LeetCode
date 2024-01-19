class Solution {
    public boolean closeStrings(String word1, String word2) {
        int lengthW1 = word1.length();
        int lengthW2 = word2.length();
        ArrayList<Integer> alreadyTaken = new ArrayList<>();
        ArrayList<Integer> answerFound = new ArrayList<>();
        if(lengthW1 != lengthW2) return false;

        int[] word1Array = new int[26];
        int[] word2Array = new int[26];

        for(char c : word1.toCharArray()){
                word1Array[c-'a']++;  
        }
        for(char c : word2.toCharArray()){
                word2Array[c-'a']++;  
        }
        for(int i = 0 ; i <26 ; i++ ){
            if((word1Array[i]==0 && word2Array[i] != 0) || (word1Array[i]!=0 && word2Array[i] == 0))return false;
            if(word1Array[i] == word2Array[i] && word1Array[i]!=0) answerFound.add(i);
        }
        
        for(int i = 0 ; i < 26 ; i++){
            if(!answerFound.contains(i)){
                if(word1Array[i] != word2Array[i] && word1Array[i]!=0){
                    int j = 0;
                    for(; j <26 ; j++){
                          if(!alreadyTaken.contains(j)){     
                                if(word1Array[i] == word2Array[j]){
                                     alreadyTaken.add(j);
                                     break;     
                                }
                          }
                    }
                    if(!alreadyTaken.contains(j))return false;
                }
            }          
        }
        
        return true;
        


        
    }
}
/*
task :--->> to 
"cabbba"    "abbccc"
c-> 1  a->1
a->2   b->2
b->3   c->3
-------------------------

*/


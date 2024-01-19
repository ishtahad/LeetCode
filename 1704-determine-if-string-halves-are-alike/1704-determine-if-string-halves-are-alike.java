class Solution {
    public boolean halvesAreAlike(String s) {
        int lengthMiddle = s.length()/2;
        int leftvowelnumber = countVowels(s,0,lengthMiddle,0);
        int rightvowelnumber = countVowels(s,lengthMiddle,lengthMiddle*2,0); 
        //return countVowels2(s,0,lengthMiddle*2,0,0);
        return leftvowelnumber==rightvowelnumber;
    }

    public int countVowels(String str , int start, int end,int count){
        for(int i = start ; i< end ;i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
               || str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'
              )count++;
        }
        return count;
    }

/*
    public boolean countVowels2(String str , int start, int end,int countleft,int countRight){
        int i = 0;
        int j = end-1;
        while(i<j){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
               || str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'
              )countleft++;

            if(str.charAt(j)=='a'|| str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'
               || str.charAt(j)=='A'|| str.charAt(j)=='E'||str.charAt(j)=='I'||str.charAt(j)=='O'||str.charAt(j)=='U'
              )countRight++; 
              i++;
              j--; 
        }
        
        return countleft==countRight;
    }
    */
}
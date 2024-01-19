class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int r = 0;
        int k = s.length - 1;
        Arrays.sort(g);
        Arrays.sort(s);
        if(s.length==0 || g.length == 0){
            return r;
        }       
        for(int i = g.length -1  ; i>=0 && k >= 0 ; i--){
            if(g[i] <= s[k]){
                 r++;
                 k--;     
            }
        }
        return r;
    }
}
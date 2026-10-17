class Solution {
    public int strStr(String haystack, String needle) {
        int haylen=haystack.length();
        int needlelen=needle.length();
        if(haylen<needlelen){
            return -1;
        }
        for(int i=0;i<=haylen-needlelen;i++){
            int j=0;
            while(j<needlelen &&haystack.charAt(i+j)== needle.charAt(j)){
                j++;
            }
            if(j==needlelen){
                return i;
            }
        }
        return -1;
    }
}
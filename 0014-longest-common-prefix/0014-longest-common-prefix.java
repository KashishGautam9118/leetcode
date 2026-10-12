class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0){
            return "";
        }
        String s=strs[0];
        int res=s.length();
        for(int i=1;i<n;i++){
            String s1=strs[i];
            int j=0;
            int count=0;
            while(j<s.length() && j<s1.length()){
                if(s.charAt(j)==s1.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
                j++;
            }
            if(count<res){
                res=count;
            }
        }
        return strs[0].substring(0,res);
    }
}
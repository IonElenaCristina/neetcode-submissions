class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s= s.toLowerCase();
        s = s.replace(" ","");
        int i =0;
        int j=s.length()-1;
        System.out.println(s);
        while(i<s.length() && j >0){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

public class LongestCommanPrefix {
     public String longestCommonPrefix(String[] strs) {
    
      String prefix = strs[0];
      if(strs.length==1){
          prefix = strs[0];
      }else{
        for(int i=1; i<strs.length;i++){
            prefix = findTheComman(prefix,strs[i]);
            System.out.println("After operation"+prefix);
         }
      }
      
       return prefix;
        
    }
    public String findTheComman(String word1, String word2){
        String prefixLetter ="";
        for(int i=0,  j=0; i<word1.length() && j< word2.length();i++,j++){
            if(word1.charAt(i)== word2.charAt(j)){
                prefixLetter = prefixLetter + word2.charAt(j);
            }
            else{
                return prefixLetter;
            }
        }
        return prefixLetter;

    }
    public static void main(String[] args) {
        LongestCommanPrefix lcp = new LongestCommanPrefix();
        String [] strs = {"aaa","aa","aaaa"};// result = "fl"
          String result = lcp.longestCommonPrefix(strs); 
          System.out.println(result);
    }    
}

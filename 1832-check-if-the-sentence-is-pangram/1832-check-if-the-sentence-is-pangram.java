class Solution {
    public boolean checkIfPangram(String sentence) {
          if(sentence.length()<26)
            return false;
        int[] checklist = new int[26];
        
        
        
        
        for(int i=0; i<sentence.length(); i++){
            checklist[sentence.charAt(i)-'a']++;
        }
        for(int i=0; i<checklist.length; i++){
            if(checklist[i]==0)
                return false;
        }
        return true;
    }
}
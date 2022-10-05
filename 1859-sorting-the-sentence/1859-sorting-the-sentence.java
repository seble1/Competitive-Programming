class Solution {
    public String sortSentence(String s) {
        
        StringBuilder sortedSentence = new StringBuilder();
        String[] sentence = s.split(" ");
        
        int unsorted = sentence.length;
        
        while(unsorted!=0){
            
            
            for(int i=0;i<unsorted-1;i++){
                
                int current = (int)(sentence[i].charAt(sentence[i].length()-1));
                int next = (int)(sentence[i+1].charAt(sentence[i+1].length()-1));
                if(current>next){
                    String temp = sentence[i];
                    sentence[i] = sentence[i+1];
                    sentence[i+1] = temp;
                }
                
                
            }
            unsorted--;
            
        }
        
        for(int i=0;i<sentence.length;i++){
            
            String word = sentence[i].substring(0,sentence[i].length()-1);
            sortedSentence.append(word + " ");
        }
        
        return sortedSentence.toString().trim();
            
    }
}
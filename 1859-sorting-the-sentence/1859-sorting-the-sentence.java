class Solution {
    public String sortSentence(String s) {
        
       Map<Integer,String> words = new HashMap<>();
        
       for(String word: s.split(" ")){
           
          int lastIndex = word.length()-1;
          int index = word.charAt(lastIndex) - '0';
          System.out.println(index);
          String value = word.substring(0, lastIndex);
          words.put(index,value );
      }
        
      StringBuilder sortedSentence = new StringBuilder();
     
        
      for(int key:words.keySet()){
          String word = words.get(key);
          sortedSentence.append(word + " ");
      }
        
      return sortedSentence.toString().trim();
        
    }
}
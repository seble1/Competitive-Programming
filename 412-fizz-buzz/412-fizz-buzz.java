class Solution {
    public List<String> fizzBuzz(int n) {
        
       List<String> answer = new ArrayList<String>();
    
       int i = 1;
       
        
       while(i<=n){
           
            String value ="";
            if(i%3==0){
                value += "Fizz";
            }
            if(i%5==0){
                value += "Buzz";
            }
            if(value.equals("")){
                value += ""+i;
            }
           
            answer.add(value);
            i++;
        }
        
        return answer;
    }
}
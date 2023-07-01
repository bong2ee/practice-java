package kr.co.ezen.baek;

   

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int c = 0;
        int d = 0;
        for(int i=0; i<s.length();i++) {
          char a = s.charAt(i);
          if(a == 'p' || a == 'P')
        	  c++;
          if(a == 'y' || a == 'Y')
        	  d++;
          }
          if(c==d) {
	        	answer = true;
          }
	      else if(c!=d) {
	        	answer = false;
	      }
        
        
        return answer;
    }
}
   
   


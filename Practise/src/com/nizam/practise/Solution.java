package com.nizam.practise;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=s.length();
        int length=1;
        for(int i=0;i<size;i++){
        	
        	System.out.println("i is "+i);
        	
            for(int j=i+1;j<size;j++){
            	System.out.println("j is "+j);
               boolean result =  isAllUniqueChars(s,i,j);
               System.out.println(result);
                if(result) {
                	System.out.println("result is true...hence incrementing the lenght");
                    length++;
                }
                
                System.out.println(length);
                    
            }
        }
        return length;
    }
        
        public boolean isAllUniqueChars(String str, int start, int end){
            Set<Character> charSet = new HashSet<Character>();
            
            for(int i=start; i<=end;i++){
                Character c = str.charAt(i);
                System.out.println("character is "+c);
                if(charSet.contains(c)){
                    return false;
                }else{
                	System.out.println("charecter is not present in set....hence adding it");
                    charSet.add(c);
                }
                    
                
                
            }
            return true;
        }
        
        
        
        public static void main(String[] args) {
        	Solution sol = new Solution();
        int max=	sol.lengthOfLongestSubstring("aba");
        System.out.println(max);
        }
    }


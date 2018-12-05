package com.nizam.practise;

import java.util.HashSet;
import java.util.Set;

public class StringOperations {

    Set<String> stringSet = new HashSet<String>();

    public int maxLengthOfSubString(String input){
    	int maxLength=0;

        for(int i =0;i<input.length()-2;i++){
            for(int j=i+1;j<input.length();j++){
            	
            	/*String subString = input.charAt(i)+input.charAt(j);
            	if(isAllUnique()) {
            		
            	}*/
                
            }
        }
		return 0;


    }
    
    
    public boolean isAllUnique(String str) {
    	
    	
    	return true;
    }


    public static void main(String[] args) {

        StringOperations str = new StringOperations();
        str.maxLengthOfSubString("abcd");


    }
}

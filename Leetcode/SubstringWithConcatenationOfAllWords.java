import java.util.*;
public class SubstringWithConcatenationOfAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wordgoodgoodgoodbestword";
	    String[] words = {"word","good","best","good"};
	    
//	    "wordgoodgoodgoodbestword"
//	    ["word","good","best","good"]
	    
	    System.out.println(findSubstring(str, words));

	}
	public static List<Integer> findSubstring(String s, String[] words) {
        if(s.length()==0 || words.length==0)return null;        
        int numWords = words.length;
        
        HashMap<String,Integer> freq = new HashMap<>();
        for(int i=0; i<numWords; i++)
        	freq.put(words[i],freq.getOrDefault(words[i],0)+1);
        
        System.out.println(freq);
        
        int wordLen = words[0].length();
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0 ; i<=s.length() - (wordLen*numWords); i++){
            HashMap<String,Integer> seen = new HashMap<>();
            for(int j=0;j<numWords; j++){
                int idx=i+j*wordLen;
                String currWord = s.substring(idx,idx+wordLen);  
                System.out.println(currWord);
                if(!freq.containsKey(currWord))break;                
                seen.put(currWord, seen.getOrDefault(currWord,0)+1);                
                if(seen.get(currWord)> freq.get(currWord))break;                
                if(j+1 == numWords)res.add(i);
            }
        }
        return res;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<Character,Integer>();
        HashMap<Character, Integer> tmap = new HashMap<Character,Integer>(); 

        for(var i = 0; i <s.length();i++){
            char c = s.charAt(i);
            char cc = t.charAt(i);

            if(smap.containsKey(c)){
                smap.put(c,smap.get(c)+1);
            }else{
                smap.put(c,1);
            }

            if(tmap.containsKey(cc)){
                tmap.put(cc,tmap.get(cc)+1);
            }else{
                tmap.put(cc,1);
            }

        }
        if(smap.equals(tmap)){
                return true;
            }else{
                return false;
            }
        
    }
}

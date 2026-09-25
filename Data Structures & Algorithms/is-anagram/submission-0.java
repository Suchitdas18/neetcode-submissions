class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> counts = new HashMap<>();
        HashMap<Character,Integer> countt = new HashMap<>();

        for(char c : s.toCharArray()){
            int count = counts.getOrDefault(c,0)+1;
            counts.put(c,count);
        }
        for(char c : t.toCharArray()){
            int count = countt.getOrDefault(c,0)+1;
            countt.put(c,count);
        }
        return counts.equals(countt);
    }
}

class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> requiredMap = new HashMap<>();
        HashMap<Character, Integer> currentMap = new HashMap<>();
        String result = "";

        if(s.equals(t)) return s;

        if(s.length() < t.length()) return result;

        for(int i = 0; i < t.length(); i++) {
            if(requiredMap.containsKey(t.charAt(i))) requiredMap.put(t.charAt(i), requiredMap.get(t.charAt(i)) + 1);
            else requiredMap.put(t.charAt(i), 1);
        }

        System.out.println(requiredMap);

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int begin = 0;
        int formed = 0;
        int required = requiredMap.size();

        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            currentMap.put(rightChar, currentMap.getOrDefault(rightChar, 0) + 1);

            if(requiredMap.containsKey(rightChar) && requiredMap.get(rightChar).equals(currentMap.get(rightChar))) formed++;

            while(formed == required) {

                if(right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    begin = left;
                }

                char leftChar = s.charAt(left);

                currentMap.put(leftChar, currentMap.get(leftChar) - 1);

                if(requiredMap.containsKey(leftChar) && currentMap.get(leftChar) < requiredMap.get(leftChar)) formed--;

                left++;
            }
        
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(begin, begin+minLength);
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];

        for(int currentDay = 0; currentDay < temperatures.length; currentDay++) {
            for(int nextWarmerDay = currentDay; nextWarmerDay < temperatures.length; nextWarmerDay++) {
                if(temperatures[nextWarmerDay] > temperatures[currentDay]) {
                    result[currentDay] = nextWarmerDay - currentDay;
                    break;
                }
            }
        }

        return result;
    }
}

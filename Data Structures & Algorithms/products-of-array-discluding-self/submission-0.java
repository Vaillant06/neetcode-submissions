class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        Arrays.fill(product, 1);

        for(int i = 0; i < nums.length; i++) {
            for(int j=0; j < nums.length; j++) {
                if(i == j) continue;
                product[i] *= nums[j];
            }
        }

        return product;
    }
}  

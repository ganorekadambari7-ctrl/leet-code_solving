class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     ArrayList<Integer> list =new ArrayList<>();
     for(int i=0;i<nums1.length; i++){
        for(int j=0;j<nums2.length; j++){

            if(nums1[i]==nums2[j])
            {
                if(!list.contains(nums1[i]))
                {
                    list.add(nums1[i]);
                }
            } 
        }
     }
        int[] ans=new int [list.size()];
        for(int i=0;i<list.size() ;i++){
        ans[i]= list.get(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
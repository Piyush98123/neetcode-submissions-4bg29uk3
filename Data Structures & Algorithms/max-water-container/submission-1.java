class Solution {
    public int maxArea(int[] heights) {
         int area = 0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
        int min = Math.min(heights[l],heights[r]);
        area=Math.max(area, min*(r-l));
        if (heights[l] < heights[r]) {
            l++;
        } else {
            r--;
        }
        }
        return area;
    }
}

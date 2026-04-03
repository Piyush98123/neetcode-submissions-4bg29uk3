class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        // left smaller
        int lb[]=new int[heights.length];
        lb[0]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
         for (int i = 1; i < lb.length; i++) {
            while (!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
        // right smaller
         int rb[]=new int[heights.length];
         rb[heights.length-1]=heights.length;
         st = new Stack<>();
         st.push(heights.length-1);
        for (int i = rb.length-2; i >=0; i--) {
            while (!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=heights.length;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
        // area
        for (int i=0;i<heights.length;i++){
            int width = rb[i]-lb[i]-1;
            int area = width*heights[i];
            max=Math.max(area, max);
        }
        return max;
    }
}

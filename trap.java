class Solution {
    public int trap(int[] height) {
        int leftBoundary[]= new int[height.length];
        int rightBoundary[]= new int[height.length];
        int maxleft=Integer.MIN_VALUE;
        int maxRight=Integer.MIN_VALUE;
        //Calculating left boundary
        for(int i=0;i<height.length;i++){
            maxleft=Math.max(maxleft,height[i]);
            leftBoundary[i]=maxleft;
        }

        //Calculating right boundary
        for(int i=height.length-1;i>=0;i--){
            maxRight=Math.max(maxRight,height[i]);
            rightBoundary[i]=maxRight;
        }
        // System.out.println(Arrays.toString(leftBoundary));
        // System.out.println(Arrays.toString(rightBoundary));
        
        int ans=0;
        for(int i=0;i<height.length;i++){
            int val=Math.min(leftBoundary[i],rightBoundary[i]);
            ans+=val-height[i]>0? val-height[i]: 0;
        }

        return ans;

    }
}

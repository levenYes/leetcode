class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0; i < height.length - 1; i++) {
          for(int j=i+1; j < height.length; j++) {
            int area = area(i, height[i], j, height[j]);
            if(area > maxArea) {
              maxArea = area;
            }
          }
        }

        return maxArea;
    }

    private int area(int x1, int y1, int x2, int y2) {
      return (x2 - x1)*getSmallerInt(y1, y2);
    }

    private int getSmallerInt(int a, int b) {
      if(a > b) {
        return b;
      }

      return a;
    }
}

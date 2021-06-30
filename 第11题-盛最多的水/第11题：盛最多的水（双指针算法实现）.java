class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
          int area = area(left, height[left], right, height[right]);
          if (maxArea < area) {
            maxArea = area;
          }

          if (height[left] < height[right]) {
            left ++;
          } else {
            right --;
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

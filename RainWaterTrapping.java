package JAVA_DSA.basic.ARRAY;

public class RainWaterTrapping {
    public static int trappedwater(int height[]){
        //To calculate left max boundry
        int LeftMax[] = new int[height.length];
        //left[0] = height[0]--> because we initialise the left max value with 0th index
        LeftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            //left max = if leftmax > height then the left max = leftmax else height
            LeftMax[i] = Math.max(LeftMax[i - 1], height[i]);
        }
        //To calculate Right max boundry
        int RightMax[] = new int[height.length];
        RightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], height[i]);
        }
        int trapped = 0;
        for (int i = 0; i < height.length; i++) {
            //waterlevel = minimum of (leftmax , rightmax)
            int waterlevel = Math.min(LeftMax[i] ,RightMax[i]);
            //trapped water = waterlevel - height;
            trapped += waterlevel-height[i];
        }
        return trapped;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
    }
}

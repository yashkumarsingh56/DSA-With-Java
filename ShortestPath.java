package JAVA_DSA.basic.STRINGS;

public class ShortestPath {
    public static float shortestPath(String path) {
        int x = 0 , y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            //south
            if (direction == 'S') {
                y--;
            }
            //north
            else if (direction == 'N') {
                y++;
            }
            //west
            else if (direction == 'W') {
                x--;
            }
            else if (direction == 'E') {
                x++;
            }
        }
        int x2 = (x*x);
        int y2 = (y*y);
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main (String args[]){
        String path = "NSEWEEENNNN";
        System.out.println(shortestPath(path));
    }
}

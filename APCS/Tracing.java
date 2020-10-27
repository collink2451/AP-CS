package APCS;

public class Tracing {
    public static void main(String args[]) {
         int x = 0; // 0 - -
         int y = 5; // 0 5 -
         int z = 1; // 0 5 1
         x++; // 1 5 1
         y-=3; // 1 2 1
         z = x + z; // 1 2 2
         x = y * z; // 4 2 2
         y%=2; // 4 0 2
         z--; // 4 0 1
    }
}

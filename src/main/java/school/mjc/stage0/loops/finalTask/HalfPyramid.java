package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int x = 0; x < cathetusLength; x++)
        {
            for (int y = 0; y < cathetusLength - x - 1; y++)
            {
                System.out.print(" ");
            }
            for (int z = 0; z < x + 1; z++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

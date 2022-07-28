package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            String[] pyramid = new String[cathetusLength];
            pyramid[0] = "1";
            for (int row = 1; row < cathetusLength; row++) {
                pyramid[row] = (row + 1) + "" + pyramid[row - 1] + "" + (row + 1);
            }

            for (String line : pyramid) {
                int len = (pyramid[cathetusLength - 1].length() + line.length()) / 2;
                System.out.printf("%" + len + "s\n", line);
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

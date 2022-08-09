package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height / 2; i++) {
            String out = "";
            for (int j = 0; j < height; j++) {
                if (j >= i && j < height - i) {
                    out += "8";
                } else {
                    out += " ";
                }
            }
            System.out.println(out);
        }
        int heightSecond = height % 2 == 0 ? height / 2 - 1 : height / 2;
        for (int i = heightSecond; i >= 0; i--) {
            String out = "";
            for (int j = 0; j < height; j++) {
                if (j >= i && j < height - i) {
                    out += "8";
                } else {
                    out += " ";
                }
            }
            System.out.println(out);
        }
    }
}

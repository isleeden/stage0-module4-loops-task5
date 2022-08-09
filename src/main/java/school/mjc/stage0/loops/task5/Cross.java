package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center = (int) Math.round(sideLength / 2.0);
        for (int i = 1; i <= sideLength; i++) {
            String out = "";
            for (int j = 1; j <= sideLength; j++) {
                if (center == i) {
                    out += "8";
                } else {
                    if (center == j) {
                        out += "8";
                    } else {
                        out += " ";
                    }
                }

            }
            System.out.println(out);
        }
    }
}

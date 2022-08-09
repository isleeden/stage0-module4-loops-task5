package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            String out = "";
            for(int j = 1; j <= cathetusLength; j++) {
                if(j <= i) {
                    out += "8";
                } else {
                    out += " ";
                }
            }
            System.out.println(out);
        }
    }
}

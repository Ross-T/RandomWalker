public class RandomWalker {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        int i = 0;

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) != r - Math.abs(y)) {
            double direction = Math.random();
            if (direction <= 0.25) {
                y += 1;
            } else if (direction <= 0.5 && direction > 0.25) {
                x += 1;
            } else if (direction <= 0.75 && direction > 0.5) {
                y -= 1;
            } else if (direction > 0.75) {
                x -= 1;
            }
            System.out.println("(" + x + ", " + y + ")");
            i += 1;
        }

        System.out.println("steps = " + i);
    }

}
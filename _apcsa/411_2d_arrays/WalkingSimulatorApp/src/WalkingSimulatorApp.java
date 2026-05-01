public class WalkingSimulatorApp {

    public static void typewriter(String s) {
        try {
            for (char c : s.toCharArray()) {
                System.out.print(c); // print characters without newline
                Thread.sleep(10); // wait for some milli seconds
            }
        } catch (InterruptedException e) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) throws Exception {

        typewriter("Welcome to the Walking Simulator!\n\n");

        Game myGame = new Game();
        myGame.play();
    }
}

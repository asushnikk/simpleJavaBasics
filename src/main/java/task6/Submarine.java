package task6;

public class Submarine {

    private Engine engine;
    private boolean status;

    private class Engine {
        public void start() {
            status = true;
        }
    }

    public String engineStart() {
        engine = new Engine();
        engine.start();
        return "Поплыли тупа";
    }
}

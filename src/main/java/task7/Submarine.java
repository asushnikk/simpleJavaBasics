package task7;

import lombok.Data;

@SubmarineInformation(weight = 1488, color = "gayColor")
@Data
public class Submarine {

    private Engine engine;
    private boolean engineWorkStatus;

    public class Engine {

        @WorkStatus(engineWorkStatus = true)
        public void engineStart() {
            engineWorkStatus = true;
        }

        @WorkStatus(engineWorkStatus = false)
        public void engineStop() {
            engineWorkStatus = false;
        }
    }

    public Engine egineStart() {
        engine = new Engine();
        engine.engineStart();
        System.out.println("Затарахтели");
        return engine;
    }

    public void egineStop(Engine engine) {
        engine.engineStop();
        System.out.println("Приехали.... Тоесть приплыли");
    }

}


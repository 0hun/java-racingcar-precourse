package racingcar.controller;

import racingcar.model.CarMovableStrategy;
import racingcar.model.Cars;
import racingcar.model.GameRound;
import racingcar.model.MovableStrategy;

public class RacingMachine {

    public RacingMachine() {
    }

    public Cars start(String[] names, int round) {
        MovableStrategy movableStrategy = new CarMovableStrategy();
        Cars cars = Cars.of(names, movableStrategy);

        GameRound gameRound = new GameRound(round);

        while(!gameRound.isEnd()) {
            gameRound.reduceRound();

            cars.move();
        }

        return cars;
    }
}

package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int curPosition() {
        return position;
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        if (randomNumber >= 4) {
            this.position += 1;
        }
    }
}

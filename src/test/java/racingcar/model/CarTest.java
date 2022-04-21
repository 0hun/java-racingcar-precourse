package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @DisplayName("자동차 생성 테스트")
    @Test
    void carCreateTest() {
        // given
        String name = "pobi";


        // when
        Car car = new Car(name);

        // then
        assertThat(car.getName()).isEqualTo(name);
    }

    @DisplayName("자동차 이동 테스트")
    @Test
    void carMoveTest() {
        // given
        Car car = new Car("pobi");

        // when
        car.move();

        // then
        assertThat(car.curPosition()).isGreaterThan(0);
    }

}

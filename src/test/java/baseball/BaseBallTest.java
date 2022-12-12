package baseball;

import domain.Ball;
import enums.BallResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallTest {
    private Ball computer;

    @BeforeEach
    void 초기화() {
        computer = new Ball(1, 1);
    }

    @Test
    void number_잘못된_숫자_입력() {
        assertThat(computer.result(new Ball(10, 1))).isEqualTo(BallResult.NOTHING);
    }

    @Test
    void index_잘못된_자릿수_입력() {
        assertThat(computer.result(new Ball(3, 4))).isEqualTo(BallResult.NOTHING);
    }

    @Test
    void 낫씽_실패() {
        assertThat(computer.result(new Ball(1, 1))).isEqualTo(BallResult.NOTHING);
    }

    @Test
    void 낫씽_성공() {
        assertThat(computer.result(new Ball(3, 2))).isEqualTo(BallResult.NOTHING);
    }

    @Test
    void 볼_실패() {
        assertThat(computer.result(new Ball(2, 1))).isEqualTo(BallResult.BALL);
    }

    @Test
    void 볼_성공() {
        assertThat(computer.result(new Ball(1, 3))).isEqualTo(BallResult.BALL);
    }
}

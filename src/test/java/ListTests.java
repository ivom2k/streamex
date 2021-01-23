import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class ListTests {

    @Test
    public void testAllOnes() {

        assertThat(ListExercises.returnAllOnes(List.of(1, 0, 1, 1, 0)), equalTo(List.of(1, 1, 1)));

        assertThat(ListExercises.returnAllOnes(List.of(1, 0, 1, 1, 0)), is(not(List.of(1, 0, 1, 1, 0))));
    }

    @Test
    public void testAllZeros() {

        assertThat(ListExercises.returnAllZeros(List.of(2, 4, 0, 8, 16, 0)), equalTo(List.of(0, 0)));

        assertThat(ListExercises.returnAllZeros(List.of(2, 4, 0, 8, 16, 0)), is(not(List.of(2, 4, 0, 8, 16, 0))));
    }

    @Test
    public void testAllEvens() {

        assertThat(ListExercises.getAllEvens(List.of(2, 4, 7, 19, 33, 62)), equalTo(List.of(2, 4, 62)));

        assertThat(ListExercises.getAllEvens(List.of(2, 4, 7, 19, 33, 62)), is(not(List.of(2, 4, 7, 19, 33, 62))));
    }

    @Test
    public void testAllOdds() {

        assertThat(ListExercises.getAllOdds(List.of(2, 4, 7, 15, 32, 65)), equalTo(List.of(7, 15, 65)));

        assertThat(ListExercises.getAllOdds(List.of(2, 4, 7, 15, 32, 65)), is(not(List.of(2, 4, 7, 15, 32, 65))));

    }

    @Test
    public void testAllToThePowerTwo() {

        assertThat(ListExercises.getAllToThePowerTwo(List.of(2, 4, 8, 16, 64)), equalTo(List.of(4, 16, 64, 256, 4096)));

        assertThat(ListExercises.getAllToThePowerTwo(List.of(2, 4, 8, 16, 64)), is(not(List.of(2, 4, 8, 16, 64))));
    }

    @Test
    public void testAllToThePowerThree() {

        assertThat(ListExercises.getAllToThePowerThree(List.of(2, 4, 8, 16)), equalTo(List.of(8, 64, 512, 4096)));

        assertThat(ListExercises.getAllToThePowerThree(List.of(2, 4, 8, 16)), is(not(List.of(2, 4, 8, 16))));
    }

    @Test
    public void testSortedFromLowestList() {

        assertThat(ListExercises.getSortedFromLowestList(List.of(64, 16, 32, 4, 8, 2)), equalTo(List.of(2, 4, 8, 16, 32, 64)));

        assertThat(ListExercises.getSortedFromLowestList(List.of(64, 16, 32, 4, 8, 2)), is(not(List.of(64, 16, 32, 4, 8, 2))));

        assertThat(ListExercises.getSortedFromLowestList(List.of(64, 16, 32, 4, 8, 2)), is(not(List.of(64, 32, 16, 8, 4, 2))));
    }

    @Test
    public void testSortedFromHighestList() {

        assertThat(ListExercises.getSortedFromHighestList(List.of(64, 16, 32, 4, 8, 2)), equalTo(List.of(64, 32, 16, 8, 4, 2)));

        assertThat(ListExercises.getSortedFromHighestList(List.of(64, 16, 32, 4, 8, 2)), is(not(List.of(64, 16, 32, 4, 8, 2))));

        assertThat(ListExercises.getSortedFromHighestList(List.of(64, 16, 32, 4, 8, 2)), is(not(List.of(2, 4, 8, 16, 32, 64))));
    }

    @Test
    public void getFirstThreePowerOfTwo() {

        assertThat(ListExercises.getFirstThreePowerOfTwo(List.of(2, 4, 8, 16, 32, 64)), equalTo(List.of(4, 16, 64)));

        assertThat(ListExercises.getFirstThreePowerOfTwo(List.of(2, 4, 8, 16, 64)), is(not(List.of(8, 64, 512))));

        assertThat(ListExercises.getFirstThreePowerOfTwo(List.of(2, 4, 8, 16, 64)), is(not(List.of(4, 16, 64, 256, 4096))));
    }

}

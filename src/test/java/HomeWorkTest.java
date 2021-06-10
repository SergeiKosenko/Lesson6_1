

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.params.ParameterizedTest;
        import org.junit.jupiter.params.provider.Arguments;
        import org.junit.jupiter.params.provider.MethodSource;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Stream;

public class HomeWorkTest {

        @ParameterizedTest
        @MethodSource("fillSliceParams")
        void sliceTest(int[] in, int [] out) {
            Assertions.assertArrayEquals(out, HomeWork.sliceArray(in));
        }

        static Stream<Arguments> fillSliceParams() {
            List<Arguments> list = new ArrayList<>();
            list.add(Arguments.arguments(new int[] {4, 3, 8, 4, 2, 5, 6, 5, 7, 9, 2}, new int[] {2, 5, 6, 5, 7, 9, 2}));
            list.add(Arguments.arguments(new int[] {4}, new int[] {}));
            list.add(Arguments.arguments(new int[] {2, 4, 2, 5, 8, 2, 5, 6, 5, 7}, new int[] {2, 5, 8, 2, 5, 6, 5, 7}));
            return list.stream();
        }

        @Test
        void testSliceException() {
            Assertions.assertThrows(RuntimeException.class, () -> HomeWork.sliceArray(new int[] {1,2,23,7}));
        }

        @Test
        void oneAndFourTest() {
            Assertions.assertTrue(HomeWork.hasOneAndFour(new int[] {1,1,1,4,4,4,1}));
        }
    }


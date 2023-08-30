import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minimumReplacementTest1() {
        int[] nums = {3, 9, 3};
        long expected = 2;
        long actual = new Solution().minimumReplacement(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minimumReplacementTest2() {
        int[] nums = {1, 2, 3, 4, 5};
        long expected = 0;
        long actual = new Solution().minimumReplacement(nums);

        Assert.assertEquals(expected, actual);
    }
}

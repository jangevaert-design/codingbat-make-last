public class makeLast {
  public int[] makeLast(int[] nums) {
    int[] outcome = new int[nums.length * 2];
    outcome[outcome.length -1] = nums[nums.length -1];
    return outcome;
  }
}

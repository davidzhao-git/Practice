package self.study.array;

public class DistributeCandiesDemo {

	public static void main(String[] args) {
		
		int people = 3;
		int candy = 30;
		int[] arr = distributeCandies(candy, people);
		
	}

	public static int[] distributeCandies(int candies, int num_people) {

		int[] result = new int[num_people];
		int size = num_people;
		int i = 0;
		int distributedCandies = 1;

		while (candies > 0) {

			if (candies <= distributedCandies) {
				result[i] += candies;
			} else {
				result[i] += distributedCandies;
			}
			System.out.println("result[" + i + "]: " + result[i]);

			candies = candies - distributedCandies;
			distributedCandies++;

			i++;
			if (i == size) {
				i = 0;
			}
		}

		return result;
	}

}

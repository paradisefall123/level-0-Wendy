
public class BottlesOfBeer {
	public static void main(String[] args) {
		for (int i = 99; i >= 0; i--) {
			if (i == 1) {
				System.out.println(
						"1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall.");

			} else if (i == 0) {
				System.out.println(
						"No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");

			} else if (i == 2) {
				System.out.println(
						"2 bottles of beer on the wall, 2 bottles of beer. Take one down and pass it around, 1 bottle of beer on the wall.");
			} else {
				System.out.println(i + " bottles of beer on the wall, " + i
						+ "  bottles of beer. Take one down and pass it around, " + (i - 1)
						+ " bottles of beer on the wall.");
			}

		}
	}
}

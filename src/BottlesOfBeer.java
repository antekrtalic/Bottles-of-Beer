public class BottlesOfBeer {
    public static void main(String[] args) {
        int bottles = 99;
        String word = "bottles";

        while (bottles > 0) {
            System.out.println(bottles + " " + word + " of beer on the wall");
            System.out.println(bottles + " " + word + " of beer");
            System.out.println("take one down pass it around");
            bottles -= 1;

            if (bottles > 0) {
                System.out.println(bottles + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to store and buy some more, 99 bottles of beer on the wall...");
            }

        }
    }
}

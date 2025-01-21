public class BeerSong {

    public static void main(String[] args) {
        int beerNum = 99;
        String word;

        while (beerNum > 0 ) {
            if (beerNum == 1) {
                word = "bottle of ";
                }
                else word = "bottles of ";
            
            System.out.println(beerNum + " " + word + "beer on the wall");
            System.out.println(beerNum + " " + "beer.");
            System.out.println("Take one down");
            System.out.println("And pass around");
            beerNum = beerNum - 1;
            if (beerNum == 0){
                System.out.println("No more bottles of beer on the wall");
                }

        }
    }
}

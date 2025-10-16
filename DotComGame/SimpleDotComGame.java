public class SimpleDotComGame {
public static void main(String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

SimpleDotCom theDotCom = new SimpleDotCom();
int randomInt = (int)(Math.random() * 5);

int [] location = {randomInt, randomInt+1, randomInt+2};
theDotCom.setLocationCells(location);

boolean isAlive = true;

while(isAlive == true){
    String guess = helper.getUserInput("Input number");
    String result = theDotCom.checkYourself(guess);
    numOfGuesses++;
     if (result.equals("Drowned")) {
        isAlive = false;
        System.out.println("There are " + numOfGuesses + " hits to drown the site");
     }
}
}
}

import java.util.ArrayList;

public class DotComGame {
    GameHelper helper = new GameHelper();
    int numOfGuesses = 0;
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
           
   void setUpGame(){

        DotCom theDotCom1 = new DotCom();
        DotCom theDotCom2 = new DotCom();
        DotCom theDotCom3 = new DotCom();

        theDotCom1.siteName("Macro");
        theDotCom2.siteName("Tops Daily");
        theDotCom3.siteName("Big C");

        dotComList.add(theDotCom1);
        dotComList.add(theDotCom2);
        dotComList.add(theDotCom3);
    
        System.out.println("Your goal is to drown " + dotComList.size() + "sites");
        System.out.println("theDotCom1.siteName, theDotCom2.siteName, theDotCom3.siteName");
        System.out.println("Try to drown them with fewer hits");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    };

   void startPlaying(){

    while(!dotComList.isEmpty()){
    String userGuess = helper.getUserInput("Input number");
    checkUserGuess(userGuess);
    };

    finishGame();
   };

public void checkUserGuess(String userGuess){  
    numOfGuesses++;
    String result = "Off target";
    for (DotCom dotComToTest : dotComList){
    result = dotComToTest.checkYourself(userGuess);
     if (result.equals("Hitted")) {
        break;
     }
     if (result.equals("Drowned")) {
        dotComList.remove(dotComToTest);
        break;
     }  
    }

     System.out.println(result);
}

   void finishGame(){

    if (numOfGuesses <= 5){
        System.out.println("Congratulations! You win with just " + numOfGuesses + " hits!");
    } else {
        System.out.println("You win with " + numOfGuesses + " hits!");
        System.out.println("My Grandma playing better!");
    }

   };

   public static void main(String[] args) {

    DotComGame game = new DotComGame();
    game.setUpGame();
    game.startPlaying();
   }
};
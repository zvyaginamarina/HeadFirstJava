import java.util.ArrayList;

public class SimpleDotCom{ 
    private ArrayList<String> locationCells;
    // int [] locationCells;
    // int numOfHits = 0;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
public String checkYourself(String userInput){
    // int guess = Integer.parseInt(stringGuess);
    String result = "Off target";

    int index = locationCells.indexOf(userInput);
    if (index >= 0){
        locationCells.remove(index);
        if (locationCells.isEmpty()){
            result = "Drowned";
         } else {
                result = "Hited";
            }
        }
    

    // for (int cell : locationCells){
    //     if (guess == cell){
    //         result = "Hited";
    //         numOfHits++;
    //         break;
    //     }
    // }

    // if (numOfHits == locationCells.length){

    //     result = "Drowned";
    // }
    // System.out.println(result);
    
    return result;
}
}

class SimpleDotComTestDrive {
public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    ArrayList<String> locationCells = new ArrayList<String>();
    locationCells.add("2");
    locationCells.add("3");
    locationCells.add("4");
    dot.setLocationCells(locationCells);

    String userInput = "4";
    String result = dot.checkYourself(userInput);

    System.out.println("Пользовательский ввод: " + userInput);
    System.out.println("Результат: " + result); 
    System.out.println("Оставшиеся ячейки: " + locationCells.size());

    // int[] locations = {2,3,4};
    // dot.setLocationCells(locations);

    // String userGuess = "4";
    // String result = dot.checkYourself(userGuess);
    
    }
}

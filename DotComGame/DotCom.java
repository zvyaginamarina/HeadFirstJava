import java.util.ArrayList;

public class DotCom{ 
    private String name;
    private ArrayList<String> locationCells;
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void siteName(String n){
        name = n;
    }

public String checkYourself(String userInput){
    String result = "Off target";

    int index = locationCells.indexOf(userInput);
    if (index >= 0){
        locationCells.remove(index);
        if (locationCells.isEmpty()){
            result = "Drowned";
            System.out.println("Wow! You drowned" + name);
         } else {
                result = "Hited";
            }
        }
    
    return result;
}
}

class DotComTestDrive {
public static void main(String[] args) {
    DotCom dot = new DotCom();
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

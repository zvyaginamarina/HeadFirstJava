import java.util.ArrayList;

public class DotComGame {
//Объявляем и инициализируем переменные, которые нам понадобятся
    GameHelper helper = new GameHelper();
    int numOfGuesses = 0;
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
           
   void setUpGame(){

//Создаем три объекта DotCom, даем им имена и помещаем в ArrayList
        DotCom theDotCom1 = new DotCom();
        DotCom theDotCom2 = new DotCom();
        DotCom theDotCom3 = new DotCom();

        theDotCom1.siteName = ("Macro");
        theDotCom2.siteName = ("Tops Daily");
        theDotCom3.siteName = ("Big C");

        dotComList.add(theDotCom1);
        dotComList.add(theDotCom2);
        dotComList.add(theDotCom3);
    
//Выводим краткие инструкции
        System.out.println("Your goal is to drown " + dotComList.size() + "sites");
        System.out.println("theDotCom1.siteName, theDotCom2.siteName, theDotCom3.siteName");
        System.out.println("Try to drown them with fewer hits");

//Повторяем с каждым объектом DotCom в списке
        for (DotCom dotComToSet : dotComList){

//Запрашиваем у вспомогательного объекта адрес "сайта"
            ArrayList<String> newLocation = helper.placeDotCom(3);
            
//Вызываем сеттер из объекта DotCom, что бы передать ему местоположение
            dotComToSet.setLocationCells(newLocation);
        }
    };

   void startPlaying(){

//До тех пор, пока список объектов DotCom не станет пустым
    while(dotComList.isEmpty()){

//Получаем пользовательский ввод
    String userGuess = helper.getUserInput("Input number");

//Вызываем метод checkUserGuess
    checkUserGuess(userGuess);
    };

//Вызываем метод finishGame
    finishGame();
   };

   void checkUserGuess(){  

//Инкрементируем количество попыток, которые сделал пользователь
    numOfGuesses++;

//Подразумеваем промах, пока не выяснили обратного
    String result = "Off target";

//Повторять для всех объектов DotCom в списке
   for (DotCom dotComToTest : dotComList){

//Просим DotCom проверить ход пользователя, тщем попадание или потопление
    result = dotComToTest.checkYourself(userGuess);
     if (result.equals("Hitted")) {

//Выбираемся из цикла раньше времени
        break;
     }
     if (result.equals("Drowned")) {

//Ему пришел конец, удаляем его из списка "сайтов" и выходим из цикла
        dotComList.remove(dotComToTest);
        break;
     }  
    }
//Выводим для пользователя результат
     System.out.println(result);
}

   void finishGame(){

//Выводим сооющение о том, как пользователь прошел игру
    if (numOfGuesses <= 5){
        System.out.println("Congratulations! You win with just " + numOfGuesses + " hits!");
    } else {
        System.out.println("You win with " + numOfGuesses + " hits!");
        System.out.println("My Grandma playing better!");
    }

   };

   public static void main(String[] args) {

//Создаем игровой объект
    DotComGame game = new DotComGame();

//Говорим игровому объекту подготовить игру
    game.setUpGame();

//Говорим игровому объекту начать главный игровой цикл
    game.startPlaying();
   }
};
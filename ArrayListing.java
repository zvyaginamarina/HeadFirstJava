import java.util.ArrayList;

class Egg{

}

public class ArrayListing {
    public static void main(String[] args) {
    ArrayList<Egg> myList = new ArrayList<Egg>();
    Egg s = new Egg();
    myList.add(s);

    Egg b = new Egg();
    myList.add(b);

    int theSize = myList.size();

    boolean isIn = myList.contains(s);

    int idx = myList.indexOf(b);

    boolean empty = myList.isEmpty();

    System.out.println(theSize);
    System.out.println(isIn);
    System.out.println(idx);
    System.out.println(empty);
    }

}

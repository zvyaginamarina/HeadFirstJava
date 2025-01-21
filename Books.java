class Books {
String title;
String author;
}

class BooksTestDrive{
    public static void main(String[] args) {
        Books [] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        myBooks[0].title = "Fuits of Java";
        myBooks[1].title = "Java Gatsby";
        myBooks[2].title = "Java cookbook";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Jan";

        int x = 0;
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);

            x = x + 1;
            
        }

    }
}
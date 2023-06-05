package newTeacher.homework1;

public class Books extends Library{

    private String bookName;
    private int isbn;
    private int price;
    private String userName;
    private int shelf;

    public Books(String bookName, int isbn, int price, String userName, int shelf) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
        this.userName = userName;
        this.shelf = shelf;
    }

    public void draw(){
        System.out.println("Книга " + bookName  + "номер ISBN " + isbn + "Цена " + price);
    }
}

package Daily_Exercise;

class Book{
    public String title;
    public String author;
    public float price;

    Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
    
}

public class Ex1{

    public static void main(String[] args) {
        
        Book b1 = new Book("Songs of Ice and Fire", "George R.R. Martin", 23.33f);
        Book b2  = new Book("1984", "George Orwell", 15.99f);
        Book b3 = new Book("White Nights", "Dostosky", 6.99f);

        System.out.println(b1.toString()); 

    }
    
}

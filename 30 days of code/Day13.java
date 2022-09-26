// Declare your class here.
class MyBook extends Book{
     // Declare the price instance variable
    int price;
  /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor
    MyBook(String title, String author,int price){
        super(title,author);
        this.price=price;   
    }
  /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
}  
// End class

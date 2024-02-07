public class Book {
    private string title;
    private string author;
    private string isbn;
    private string publishyear;


    public Book(string title,string author,string isbn,string publishyear){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishyear = publishyear;
    }
    public string getTitle(){
        return title;}
    public void setTitle(string title){
        this.title=title;}

    public string getAuthor(){
        return author;}
    public void setAuthor(string author){
        this.author=author;}

    public string getIsbn(){
        return isbn;}
    public void setTitle(string isbn){
        this.isbn=isbn;}

    public string getPublishyear(){
        return publishyear;}
    public void setPublishyear(string publishyear){
        this.publishyear=publishyear;}


}

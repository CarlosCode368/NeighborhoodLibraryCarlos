public class Book {
    int id;
    String isbn;
    String title ;
    boolean isCheckOut ;
    String checkOutTo;
    Book(int id, String isbn, String title){
        this.id=id;
        this.isbn=isbn;
        this.title=title;
        this.isCheckOut=false;
        this.checkOutTo="";

    }
    void checkOut(String name){
        this.checkOutTo=name;
        this.isCheckOut=true;
    }
    void checkIn(){
        this.checkOutTo="";
        this.isCheckOut=false;
    }
    //TODO ADD GETTERS AND SETTERS?
}

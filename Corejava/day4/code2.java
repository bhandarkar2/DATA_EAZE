import java.io.Console;

class Date{
    private int day;
    private int month;
    private int year;
    public Date(  ){
      //  this(20,8,2020);    //Constructor Chaining
      this(0,0,0); 
    }
    public Date( int day, int month, int year ){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void printRecord( ){
        System.out.println(this.day+" / "+this.month+" / "+this.year);
    }
}
class Program{
   public static void main(String[] args) {
       Date dt1 = new Date( );
       dt1.printRecord();
   }
}
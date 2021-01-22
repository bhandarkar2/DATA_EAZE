import java.io.Console;

class Date{
    private int day;
    private int month;
    private int year;
    public Date(  ){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    public Date( int day, int month, int year ){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void acceptRecord( ){
        Console console =   System.console();
        System.out.print("Day   :   ");
        this.day = Integer.parseInt(console.readLine());
        System.out.print("Month   :   ");
        this.month = Integer.parseInt(console.readLine());
        System.out.print("Year   :   ");
        this.year = Integer.parseInt(console.readLine());
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void printRecord( ){
        System.out.println(this.day+" / "+this.month+" / "+this.year);
    }
}
class Program{
   public static void main(String[] args) {
       Date dt1 = new Date( );  //Instantiation
       dt1.setDay(23);
       dt1.setMonth(7);
       dt1.setYear(1983);
       
       System.out.println("Day  :   "+dt1.getDay());
       System.out.println("Month  :   "+dt1.getMonth());
       System.out.println("Year  :   "+dt1.getYear());
   }
}

            
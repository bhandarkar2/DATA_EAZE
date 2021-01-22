class Test{
    public static void main(String[] args){
       String str = "12ab5";
       int number = Integer.parseInt(str);
       System.out.println("Number   : "+number);
    
    }
    public static void main3(String[] args){
       String str = "125";
       int number = Integer.parseInt(str);
       System.out.println("Number   : "+number);
    }

    public static void main2(String[] args){
       int number =125;
       String str = String.valueOf(number); //Boxing
        System.out.println("Number   : "+str);
    }
    public static void main1(String[] args){
       int number =125;
       String str = Integer.toString(number); // Boxing
        System.out.println("Number   : "+str);
    }
}
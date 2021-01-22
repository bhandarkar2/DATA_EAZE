// class PrimeNumbers
// {
//    public static void main (String[] args)
//    {		
//        int i =0;
//        int num =0;
//        //Empty String
//        String  primeNumbers = "";

//        for (i = 1; i <= 100; i++)         
//        { 		  	  
//           int counter=0; 	  
//           for(num =i; num>=1; num--)
// 	  {
//              if(i%num==0)
// 	     {
//  		counter = counter + 1;
// 	     }
// 	  }
// 	  if (counter ==2)
// 	  {
// 	     //Appended the Prime number to the String
// 	     primeNumbers = primeNumbers + i + " ";
// 	  }	
//        }	
//        System.out.println("Prime numbers from 1 to 100 are :");
//        System.out.println(primeNumbers);
//    }
// }
        


        
        
    



// Amstrong Number
// class code2{
//     public static void main(String[] arg)
//     {
//         int number = Integer.parseInt(arg[0]);
        
//         int a, orignalnum, res = 0;
//         orignalnum = number;
//         while(number!=0){
//             a = number %10;
//             res = res + a*a*a;
//             number=number/10;
            
//         }
//         if (res==orignalnum)
//             System.out.println("Amstrong number");
//         else  
//             System.out.println("Not Amstrong number");  
//     }
// }



// class code2{
//     public static void main(String[] arg)
//     {
//         int number = Integer.parseInt(arg[0]);
//         int fact, sum =0, temp =number;
//         while(number!=0){
//             fact = 1;
//             int r = number%10;
//             for(int i = r; i>=1; i--)
//                 fact= fact*i;
//                 sum = sum+fact;
//                 number=number/10;
//         }
//         if (sum==temp)
//             System.out.println("Strong number " +sum);
//         else  
//             System.out.println(" Not Strong number " +sum);  
//     }
// }




// Perfect Number
class code2{
    public static void main(String[] arg)
    {
        int number = Integer.parseInt(arg[0]);
        int i, sum = 0;
    for (i=1;i<number;i++){
        if (number % i == 0){
            sum=sum+i;
        } 
    }    
    if (sum==number){
        System.out.println("Perfect number :"+number);
    }
    else{
        System.out.println("Not perfect number :"+number);
    }
}
}

// Palindrom
// class code2{
//     public static void main(String[] arg)
//     {
//     int a,res=0;
//     int n = Integer.parseInt(arg[0]);
//     int temp = n;
//     while(n!=0)
//     {
//     a=n%10;
//     res=(res*10)+a;
//     n=n/10;
//     }     
//     if(temp==res)    
//     System.out.println("palindrome number ");    
//     else    
//     System.out.println("not palindrome");    

// }

// }



// class code2{
// public static void main(String[] arg)
// {
// int a,res=0;
// int n = 12345;
// while(n!=0)
// {
// a=n%10;
// res=res+a;
// n=n/10;
// }
// System.out.println("addition of number is "+res);
// }
// }



// class code2{
//     public static void main(String[] args){
       
//         int num1 = Integer.parseInt(args[0]);
//         int num2 = Integer.parseInt(args[1]);
//         int sum = num1 + num2;
//         int sub = num1 - num2;
//         int mul = num1 * num2;
//         int div = num1 / num2;
//         System.out.println("Addition : "+sum);
//         System.out.println("Subtraction : "+sub);
//         System.out.println("Multiplication : "+mul);
//         System.out.println("Division : "+div);    
//     }
// }

// class code2{
//     public static void main(String[] agrs){
//         // int num1 = 9348.39;
//         int num1 = ( int )9348.39;
//         System.out.println("Integer : "+num1 + " Size of num1 : "+(Integer.SIZE/8) + " bytes");
//     }
// }


// class code2{
//     public static void main(String[] args){
//         int num1 = ( int )9348.39;
//         System.out.println("Result : "+num1+ " Size of data type :  " +(Integer.SIZE/8)+ "bytes");
  
//         long num2 = 100;
//         System.out.println("Result : "+num2+ " Size of data type :  " +(Long.SIZE/8)+ "bytes");
        
//         short num3 = (short) 80999;
//         System.out.println("Result : "+num3+ " Size of data type :  " +(Short.SIZE/8)+ "bytes");
  

//     }
// } 
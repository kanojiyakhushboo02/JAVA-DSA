public class Fictorial {
    
    public static void printName(int i, int n){
        if(i<n){
            System.out.println("Khushboo");
            
        }else{
            return;
        }
        printName(i+1, n);
    }

public static void printNumber(int i, int n){
    if(i<n){
        System.out.print(i);
    }else{
        return;
    }
    printNumber(i+1, n);
}

public static void printReverseNumber(int i, int n){
    if(i<=n){

        printReverseNumber(i+1, n);
    }else{
        return;
    }
    System.out.print(" " + i);
}

public static void printSum(int n){
    int i=1;
    int sum=0;
    if(i<=n){
        sum += i;
        i++;
    }else{
        return;
    }
    System.out.println(sum);
}


public static int factorial(int  n){
    if(n == 1){
        return 1;
    }
    return n * factorial(n-1);
}


public static int printFibbo(int n){
    if(n==1 || n==0){
        return n;
    }
    return printFibbo(n-1) + printFibbo(n-2);
}

    public static void main(String args[]){
        int i =0; 
        int n = 5;
        // printName(i,n);

        // printNumber(i+1,n);

        // printReverseNumber(i+1,n);
        // printSum(n);
        // int res = factorial(5);
        // System.out.println(res);
        
        int result = printFibbo( n);
        System.out.println(result);

    }
}

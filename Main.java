public class Main {
    public static void main(String[] args) {
        //Q1
        System.out.println("Q1");
        primeNumber(3);
        primeNumber(44);
        primeNumber(19);
        primeNumber(96);
        ///////////
        System.out.println("------------");
        ///////////
        //Q2
        System.out.println("Q2");
        System.out.println("100 --> tax = "+calculateTax(100));
        System.out.println("50 --> tax = "+calculateTax(50));
        System.out.println("1000 --> tax = "+calculateTax(1000));
        ///////////
        System.out.println("------------");
        ///////////
        //Q3
        System.out.println("Q3");
        palindrome("bob");
        palindrome("apple");
        palindrome("MOM");
        palindrome("happy");
        ///////////
        System.out.println("------------");

    }


    //Q1
    public static void primeNumber(int num){
        if(num==0||num==1){
            System.out.println(num+" Not Prime Number");
        }else
            if(num == 3 || num ==2){
                System.out.println(num + " Is Prime Number");
            }
        else
        { if(num%2==0 || num%3==0 || num%7==0 || num%5==0){
                    System.out.println(num+" Not Prime Number");
                }
            else {
                System.out.println(num + " Is Prime Number");
            }
        }

    }

    //Q2
    public static int calculateTax(int price) {
        int tax = 0;
        if (price >= 100 && price <= 500) {
            tax = price * 15 / 100;
            return tax;
        }else{
            tax = 0;
        }
        return tax;
    }


    public static void palindrome(String word){

        String word2 = "";

        for (int i = (word.length() - 1); i >=0; --i) {
            word2 = word2 + word.charAt(i);
        }

        if (word.equals(word2)) {
            System.out.println(word + " is a Palindrome");
        }
        else {
            System.out.println(word + " is not a Palindrome");
        }

        }


}




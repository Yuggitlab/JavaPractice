package simplejavaprograms;

public class PrimeNumber {

    public Integer getPrimeNumber(Integer a){
        Integer i =2;
        for ( ; i < a ; i++ ) {
            if (a % i == 0) {
                System.out.println(a + "Not a prime number");
                break;
            }
        }
        if(i == a){
            System.out.println("Prime number is"+ a);
        }
        return a;
    }

    public String getReversePrimeNumber(Integer a ) throws StringIndexOutOfBoundsException{
        String reversenumber ="";
        String firstnumber = a.toString().substring(0);
        String lastnumber = "";
        Integer numberlength = a.toString().length();
        if (a % 2 == 0 && numberlength == 5 ){
            lastnumber = String.valueOf(a).substring(4);}
        if (lastnumber.length() <= numberlength){
            reversenumber = lastnumber.concat(String.valueOf(a).substring(3,4));}
        if (reversenumber.length() <= numberlength){
            reversenumber = reversenumber.concat(String.valueOf(a).substring(2,3));}
        if (reversenumber.length() <= numberlength){
            reversenumber = reversenumber.concat(String.valueOf(a).substring(1,2));}
        if (reversenumber.length() <= numberlength){
            reversenumber = reversenumber.concat(String.valueOf(a).substring(0,1));}
        return reversenumber;
    }

}


import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;
import simplejavaprograms.PrimeNumber;

import java.util.Random;

public class TestPrimenNumbers {
 PrimeNumber primeNumber = new PrimeNumber();
 @Description("It is a method to test any number is a prime or not")
 @Test
 public void findPrimeNumber(){
  Random number = new Random();
  Integer mynumber = number.nextInt(1000);
  Integer primenumber = primeNumber.getPrimeNumber(mynumber);
  Assert.assertEquals(primenumber,mynumber);

 }

 @Description("Getting a reverse number using if else")
 @Test
 public void getReversePrimeNumber(){
  Integer a = 54672;
  System.out.println(primeNumber.getReversePrimeNumber(a));

 }

}

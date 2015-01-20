import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by smcdowell on 20/01/2015.
 */
public class MyClass {


    //A simple method to concatenate two strings
    public String concat(String one, String two){
        return one + two;
    }

    //checks whether an int is prime or not.
   public boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public boolean isListPrime(int[] nums){
        for(int i:nums){
            if(this.isPrime(i) == false){
                return false;
            }
        }
        return true;
    }

    public void lotsOfFors(){
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        for(int i = 0 ;i<10000; i++){
            String [] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            ArrayList<String> alpha =new ArrayList();
            for(String a:letters){
                alpha.add(a);
            }
            Collections.shuffle(alpha);
            String word = "";
            for(int j = 0; j<6; j++){
                word += alpha.get(j);
            }
            words.add(word);

        }
        for(String word: words){
            System.out.printf("This is the word : %s\n", word);
        }

    }

    public List<String> listSorter(List<String> input){
         Collections.sort(input);
        return input;
    }
    public static void main(String ...args) {
        //
        MyClass mc = new MyClass();
        mc.lotsOfFors();
    }

}

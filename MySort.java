
/**
 * Write a description of class MySort here.
 * 
 * @author Azteka 
 * @version 1.19.17
 */
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
public class MySort{
    ArrayList<Double> sortMe = new ArrayList<Double>();

    public MySort() {
        //for (double i : sortMe) {
        // if (sortMe.size() > 12) {
        //   double randomNum = (Math.random() * 30);
        // sortMe.add(randomNum);
        //}
        sortMe.addAll(RandomArray(10001));
    }
    
    private static ArrayList<Double> RandomArray(int n){
        /**This method creates n random numbers between 0 (inclusive) and 100 (exclusive).
         * 
         */
        ArrayList<Double> arrayRandom = new ArrayList<Double>(n);
        for (int i=0; i<n; i++)
        {
            arrayRandom.add(Math.random()*100);
        }
        return arrayRandom;
    }
    

    public void printSortMe(){
        System.out.println("Your numbers are: ");
        System.out.println();
        for (double i : sortMe) {
            System.out.println(i);
        }
    }
    
    
}

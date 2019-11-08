
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> suitcaseArray;
    private int weight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcaseArray = new ArrayList();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((suitcase.totalWeight() + weight()) <= this.maxWeight) {
            suitcaseArray.add(suitcase);

        } else {
            return;
        }

    }

    public String toString() {
        return suitcaseArray.size() + " suitcases" + "(" + weight() + ") kg)";
    }

    public int weight() {
        weight = 0;
        for (Suitcase cases : suitcaseArray) {
            weight += cases.totalWeight();
        }

        return weight;
    }
    
    public void printThings(){
        for (Suitcase cases : suitcaseArray) {
             cases.printThings(); 
        }
        
    }
    
    
    
}

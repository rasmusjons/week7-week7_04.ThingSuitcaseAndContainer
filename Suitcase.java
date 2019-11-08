
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
public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> things;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;

        things = new ArrayList();

    }

    public void addThing(Thing thing) {

        if ((thing.getWeight() + totalWeight) <= this.maxWeight) {
            totalWeight += thing.getWeight();
            things.add(thing);
        } else {
            return;
        }

    }

    public String toString() {
        int numberOfThings = things.size();
        if (things.size() == 0) {
            return "empty " + "(" + totalWeight + "kg)";

        }

        if (things.size() == 1) {
            return numberOfThings + " thing " + "(" + totalWeight + "kg)";

        }

        return numberOfThings + " things " + "(" + totalWeight + "kg)";

    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Thing heaviestThing() {
        int heaviest = 0;
        int index = -1;
        if (things.size() == 0) {
            return null;
        } else {

            for (Thing thing : things) {
                if (thing.getWeight() > heaviest) {
                     index++;
                     heaviest = thing.getWeight();
                   
                    System.out.println(heaviest);
                    System.out.println(index);
                }
            }
        }
        return things.get(index) ;
    }

}

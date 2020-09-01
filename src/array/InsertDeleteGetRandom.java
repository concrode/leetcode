package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Design a data structure that supports all following operations in average O(1) time.
 *
 * insert(val): Inserts an item val to the set if not already present.
 * remove(val): Removes an item val from the set if present.
 * getRandom: Returns a random element from current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 *
 *
 * Example:
 * // Init an empty set.
 * RandomizedSet randomSet = new RandomizedSet();
 *
 * // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomSet.insert(1);
 *
 * // Returns false as 2 does not exist in the set.
 * randomSet.remove(2);
 *
 * // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomSet.insert(2);
 *
 * // getRandom should return either 1 or 2 randomly.
 * randomSet.getRandom();
 *
 * // Removes 1 from the set, returns true. Set now contains [2].
 * randomSet.remove(1);
 *
 * // 2 was already in the set, so return false.
 * randomSet.insert(2);
 *
 * // Since 2 is the only number in the set, getRandom always return 2.
 * randomSet.getRandom();
 *
 *
 * ====================================================================
 *  * Your RandomizedSet object will be instantiated and called as such:
 *  * RandomizedSet obj = new RandomizedSet();
 *  * boolean param_1 = obj.insert(val);
 *  * boolean param_2 = obj.remove(val);
 *  * int param_3 = obj.getRandom();
 *
 */


public class InsertDeleteGetRandom {


    class RandomizedSet {
        ArrayList<Integer> nums;
        HashMap<Integer, Integer>  elements;
        Random rand = new Random();

        /** Initialize your data structure here. */
        public RandomizedSet() {
            nums = new ArrayList<>();
            elements = new HashMap<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            boolean contain = elements.containsKey(val);
            if(contain) return false;
            elements.put(val, nums.size());
            nums.add(val);

            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            boolean contain = elements.containsKey(val);
            if(!contain) return false;
            int elementPosition = elements.get(val);
            if(elementPosition < nums.size() - 1) { // Not the last one then swap the last one with this val
                int lastElement = nums.get(nums.size() - 1);
                nums.set(elementPosition, lastElement); // Replaces the element at the specified position in this list with the specified element
                elements.put(lastElement, elementPosition);
            }
            elements.remove(val);
            nums.remove(nums.size() - 1);

            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return nums.get(rand.nextInt(nums.size()));
        }
    }
}

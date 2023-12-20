​# What does the problem says?
#### The problem states that in the sequence of 1 to `num` there will be a number that would be picked by guess() method (`pick`). We need to find that number. And below are the conditions given which gives the `pick`'s which helps us to find the picked element. 
#### Conditions:
#### if `pick` == -1 then `num > pick` (pick is greater than the number which is passed in guess())
#### if `pick` == 1 then `num < pick` (pick is less than the number which is passed in guess())
#### if `pick` == 0 then `num == pick` (pick is equal to the number which is passed in guess())

# How to approach this?
#### There's no doubt that sequence from 1 to `n` will be a sorted one. We need to find the `pick` from the sorted sequence. So we basically have to **search an element from ordered sequence**. Binary search does that!

# Code:
public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = low + (high - low)/2;
        while(low<=high){
            mid = low + (high - low)/2;
            if(guess(mid) == 1)
                low = mid + 1;
            else if(guess(mid) == -1)
                high = mid - 1;
            else
                break;
        }
        return mid;
    }
}


### I hope you understood it well, can I get an upvote?

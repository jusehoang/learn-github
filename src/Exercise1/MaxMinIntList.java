package Exercise1;
import java.util.ArrayList;

class MaxMinIntList extends ArrayList<Integer> {
    public Integer min() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Integer min = this.get(0);
        for (int i = 1; i < this.size(); i++) {
            if (this.get(i) < min) {
                min = this.get(i);
            }
        }
        return min;
    }

    public Integer max() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        Integer max = this.get(0);
        for (int i = 1; i < this.size(); i++) {
            if (this.get(i) > max) {
                max = this.get(i);
            }
        }
        return max;
    }

     int min (int a){
        return a+2;
     }
}



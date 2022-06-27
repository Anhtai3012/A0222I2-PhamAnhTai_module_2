package _12_Java_collection_framework.exercise.e1;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int)(o1.getCost() - o2.getCost());
    }
}

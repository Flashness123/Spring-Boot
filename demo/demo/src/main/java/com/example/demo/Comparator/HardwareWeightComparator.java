package com.example.demo.Comparator;

import com.example.demo.Product.HardwareProduct;

import java.util.Comparator;

public class HardwareWeightComparator implements Comparator<HardwareProduct> {

    @Override
    public int compare(HardwareProduct o1, HardwareProduct o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}


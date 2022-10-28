package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return new Operation<Integer>() {
            List<Integer> list = new ArrayList<>();

            @Override
            public List<Integer> apply(List<Integer> arg) {
                for (int number : arg) {
                    list.add(number / 3);
                }
                return list;
            }
        };
    }
}

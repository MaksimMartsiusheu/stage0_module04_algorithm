package com.epam.stage0.algorithm;

import com.epam.stage0.algorithm.utils.Fridge;

public class FridgeAlgorithm {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     *
     * Вызовете методы объекта Fridge внутри метода fridgeAlgorithm в неообходимом логическом порядке.
     * P.S Все способы взаимодейстия с холодильником можно найти внутри класса {@see Fridge}
     */
    public void fridgeAlgorithm(Fridge fridge) {
        fridge.open();
        fridge.getMilk();
        fridge.close();
    }
}

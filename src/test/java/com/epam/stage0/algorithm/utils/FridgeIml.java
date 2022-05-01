package com.epam.stage0.algorithm.utils;

import java.util.LinkedList;

public class FridgeIml implements Fridge {

    private final LinkedList<Actions> actionsQueue = new LinkedList<>();

    @Override
    public void open() {
        actionsQueue.add(Actions.OPEN);
    }

    @Override
    public void getMilk() {
        actionsQueue.add(Actions.GET_MILK);
    }

    @Override
    public void close() {
        actionsQueue.add(Actions.CLOSE);
    }

    public LinkedList<Actions> getActionsQueue() {
        return actionsQueue;
    }

    public enum Actions {
        OPEN,
        CLOSE,
        GET_MILK
    }
}

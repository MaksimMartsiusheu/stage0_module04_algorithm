package com.epam.stage0.algorithm;

import com.epam.stage0.algorithm.utils.FridgeIml;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FridgeAlgorithmTest {

    FridgeAlgorithm fridgeAlgorithm = new FridgeAlgorithm();

    @Test
    public void fridgeAlgorithmTest() {
        var fridge = new FridgeIml();
        fridgeAlgorithm.fridgeAlgorithm(fridge);
        var actionsQueue = fridge.getActionsQueue();

        assertAll(
                () -> assertEquals(3, actionsQueue.size(),
                        "I think we should use 3 actions to get 1 bottle of milk =) "),
                () -> assertTrue(FridgeIml.Actions.OPEN == actionsQueue.get(0),
                        "At first, we should open the fridge =)"),
                () -> assertTrue(FridgeIml.Actions.GET_MILK == actionsQueue.get(1),
                        "I think that the order is wrong..."),
                () -> assertTrue(FridgeIml.Actions.CLOSE == actionsQueue.get(2),
                        "Did you forget to close the fridge? =)")
        );

    }


}
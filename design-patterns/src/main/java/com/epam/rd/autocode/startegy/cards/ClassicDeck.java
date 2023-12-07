package com.epam.rd.autocode.startegy.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassicDeck implements CardDealingStrategy {

    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> stacks = new HashMap<>();
        for (int i = 1; i <= players; i++){
            String playerName = "Player " + i;
            stacks.put(playerName, new ArrayList<>());
        }
        for (int i = 0; i < 5; i++){
            for (int j = 1; j <= players; j++){
                Card card = deck.dealCard();
                String playerName = "Player " + j;
                stacks.get(playerName).add(card);
            }
        }

        stacks.put("Remaining", deck.restCards());
        return stacks;
    }
}

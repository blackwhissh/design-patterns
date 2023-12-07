package com.epam.rd.autocode.startegy.cards;

import java.util.*;

public class FoolDeck implements CardDealingStrategy {

    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        List<Card> trumpCards = new ArrayList<>();
        Map<String, List<Card>> stacks = new HashMap<>();
        for (int i = 1; i <= players; i++){
            String playerName = "Player " + i;
            stacks.put(playerName, new ArrayList<>());
        }
        for (int i = 0; i < 6; i++){
            for (int j = 1; j <= players; j++){
                Card card = deck.dealCard();
                String playerName = "Player " + j;
                stacks.get(playerName).add(card);
            }
        }
        Card trumpCard = deck.dealCard();
        stacks.put("Trump card", trumpCards);
        trumpCards.add(trumpCard);

        stacks.put("Remaining", deck.restCards());
        if(trumpCards.size() > 1){
            trumpCards.remove(0);
        }
        return stacks;
    }
}

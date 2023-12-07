package com.epam.rd.autocode.startegy.cards;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return new TexasDeck();
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return new ClassicDeck();
    }

    public static CardDealingStrategy bridgeCardDealingStrategy(){
        return new BridgeDeck();
    }

    public static CardDealingStrategy foolCardDealingStrategy(){
        return new FoolDeck();
    }

}

package com.epam.rd.autocode.factory.plot;

public class ContemporaryDisneyFactory implements PlotFactory{
    private Character hero;
    private EpicCrisis epicCrisis;
    private Character funnyFriend;
    public ContemporaryDisneyFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }
    @Override
    public Plot plot() {
        return new ContemporaryDisneyPlot(hero, epicCrisis, funnyFriend);
    }
}

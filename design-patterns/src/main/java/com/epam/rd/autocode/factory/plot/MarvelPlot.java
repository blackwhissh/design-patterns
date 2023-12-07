package com.epam.rd.autocode.factory.plot;

import java.util.Arrays;

public class MarvelPlot implements Plot {
    private Character[] heroes;
    private EpicCrisis epicCrisis;
    private Character villain;
    public MarvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    public String getHero(Character[] heroes){
        StringBuilder heroNames = new StringBuilder(" brave ");
        if(heroes.length > 1){
            for (int i = 0; i < heroes.length; i++) {
                if(i == heroes.length - 1){
                    heroNames.append(heroes[i].name());
                    break;
                }
                heroNames.append(heroes[i].name()).append(", ").append("brave ");

            }

        } else if (heroes.length == 0) {
            return "No Heroes";
        } else if (heroes.length == 1) {
            heroNames.append(heroes[0].name());
        }
        return heroNames.toString();
    }


    @Override
    public String toString() {
        return epicCrisis.name() + " threatens the world. But" + getHero(heroes) + " on guard. So, no way that intrigues of " +
                villain.name() + " overcome the willpower of inflexible heroes";
    }
}

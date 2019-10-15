package com.example.recylerviewhero;

import java.util.ArrayList;
import com.example.recylerviewhero.Players;

public class PlayersData <http> {
        public static String[][] isi = new String[][]{
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
                {"Rosario, 24 Juni 1987", "Argentina", "Striker", "Barcelona", "2019 di Barcelona"},
        };

        public static ArrayList<Players> getListData(){
            ArrayList<Players> listnya = new ArrayList<>();
            for (String[] aData : isi) {
                Players players = new Players();
                Players.setBirth(aData[0]);
                Players.setKebangsaan(aData[1]);
                Players.setPosisi(aData[2]);
                Players.setClub(aData[3]);
                Players.setKarir(aData[4]);
                listnya.add(players);
            }
            return listnya;
        }
    }


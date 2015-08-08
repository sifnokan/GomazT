package gomazt;

import javafx.beans.InvalidationListener;
import javafx.collections.ArrayChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.nio.file.*; // Files, Paths;

public class FamiInfoParser {

    public static ObservableList<Familiar> familist
            = FXCollections.observableArrayList();
    FamiInfoParser() {
    }

    void read() {
        try (Stream<String> streamline = Files.lines(Paths.get("Famiinfo1.txt"))) { // 自動close
            //streamline.map(String::toUpperCase).forEach(System.out::println);
            streamline.forEach(l -> {
            // String[] lstr = l.split("|");
            // System.out.println(l);
                parse(l);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void parse(String linestr){
        String[] lsplit;
        Familiar fami;

        String[] lstr = linestr.split("[¥¥|:]");
        // 名前部分補正
        lstr[8] = lstr[8].substring(2, lstr[8].indexOf(']'));

        /*
        int j = 0;
        for(String strl : lstr){
            System.out.println(j+","+strl);
            j++;
        }
        */

        fami = new Familiar();

        for(int i=0; i < lstr.length; i++){
            if(!lstr[i].isEmpty()){
                switch (i) {
                    case 1:
                        fami.setsNo(Integer.parseInt(lstr[i]));
                        break;
                    case 3:
                        fami.setsRare(Integer.parseInt(lstr[i]));
                        break;
                    case 7:
                        fami.setsAttr(lstr[i]);
                        break;
                    case 8:
                        fami.setsName(lstr[i]);
                        break;
                    case 10:
                        fami.setsMpower(Integer.parseInt(lstr[i]));
                        break;
                    case 12:
                        fami.setsType(lstr[i]);
                        break;
                    case 13:
                        fami.setsShotclass(lstr[i]);
                        break;
                    case 14:
                        fami.setsSkillclass(lstr[i]);
                        break;
                }
            }

        }

        familist.add(fami);
    }

}

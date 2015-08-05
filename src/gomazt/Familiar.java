package gomazt;

/**
 * Created by sifnokan on 2015/08/05.
 */


// 使い魔クラス
public class Familiar {
    public final int fno = 3;

    int no;
    int rare;
    String attr;
    String name;
    int mpower;
    String shotclass;
    String skillclass;
    int skilleffect;
    Familiar fami[];

    Familiar() {
        no = 0;
        rare = 0;
        attr = "";
        name = "";
        mpower = 0;
        shotclass = "";
        skillclass = "";
        skilleffect = 0;

        fami = new Familiar[fno];
        for(int i=0; i < fno; i++){
            fami[i] = null;
        }
    }

    Familiar(int no, int rare, String attr, String name, int mpower, String shotclass, String skillclass, int skilleffect){
        super();
        this.no = no;
        this.rare = rare;
        this.attr = attr;
        this.name = name;
        this.mpower = mpower;
        this.shotclass = shotclass;
        this.skillclass = skillclass;
        this.skilleffect = skilleffect;
    }
}

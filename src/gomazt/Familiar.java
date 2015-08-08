package gomazt;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableArray;

/**
 * Created by sifnokan on 2015/08/05.
 */


// 使い魔クラス
public class Familiar {
    private final int fno = 3;

    private final SimpleIntegerProperty sNo;
    private final SimpleIntegerProperty sRare;
    private final SimpleStringProperty sAttr;
    private final SimpleStringProperty sName;
    private final SimpleIntegerProperty sMpower;
    private final SimpleStringProperty sType;
    private final SimpleStringProperty sShotclass;
    private final SimpleStringProperty sSkillclass;
    //private final SimpleStringProperty sSkilleffect;

    /*
    int no;
    int rare;
    String attr;
    String name;
    int mpower;
    String type;
    String shotclass;
    String skillclass;
    String skilleffect;
    Familiar fami[];
    */
    Familiar() {
        sNo = new SimpleIntegerProperty(0);
        sRare = new SimpleIntegerProperty(0);
        sAttr = new SimpleStringProperty("");
        sName = new SimpleStringProperty("");
        sMpower = new SimpleIntegerProperty(0);
        sType = new SimpleStringProperty("");
        sShotclass = new SimpleStringProperty("");
        sSkillclass = new SimpleStringProperty("");
    }

    void show(){
        System.out.println(sNo);
        System.out.println(sRare);
        System.out.println(sAttr);
        System.out.println(sName);
        System.out.println(sMpower);
        System.out.println(sType);
        System.out.println(sShotclass);
        System.out.println(sSkillclass);

    }

    public void setsNo(int sNo) {
        this.sNo.set(sNo);
    }

    public int getsNo() {
        return sNo.get();
    }

    public SimpleIntegerProperty sNoProperty() {
        return sNo;
    }


    public void setsRare(int sRare) {
        this.sRare.set(sRare);
    }

    public int getsRare() {
        return sRare.get();
    }

    public SimpleIntegerProperty sRareProperty() {
        return sRare;
    }

    public void setsAttr(String sAttr) {
        this.sAttr.set(sAttr);
    }

    public String getsAttr() {
        return sAttr.get();
    }

    public SimpleStringProperty sAttrProperty() {
        return sAttr;
    }

    public void setsName(String sName) {
        this.sName.set(sName);
    }

    public String getsName() {
        return sName.get();
    }

    public SimpleStringProperty sNameProperty() {
        return sName;
    }

    public void setsMpower(int sMpower) {
        this.sMpower.set(sMpower);
    }

    public int getsMpower() {
        return sMpower.get();
    }

    public SimpleIntegerProperty sMpowerProperty() {
        return sMpower;
    }

    public void setsType(String sType) {
        this.sType.set(sType);
    }

    public String getsType() {
        return sType.get();
    }

    public SimpleStringProperty sTypeProperty() {
        return sType;
    }

    public void setsShotclass(String sShotclass) {
        this.sShotclass.set(sShotclass);
    }

    public String getsShotclass() {
        return sShotclass.get();
    }

    public SimpleStringProperty sShotclassProperty() {
        return sShotclass;
    }

    public void setsSkillclass(String sSkillclass) {
        this.sSkillclass.set(sSkillclass);
    }

    public String getsSkillclass() {
        return sSkillclass.get();
    }

    public SimpleStringProperty sSkillclassProperty() {
        return sSkillclass;
    }


}

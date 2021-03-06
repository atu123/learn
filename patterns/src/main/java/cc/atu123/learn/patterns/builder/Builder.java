package cc.atu123.learn.patterns.builder;

import cc.atu123.learn.patterns.factory.AodiAuto;
import cc.atu123.learn.patterns.factory.Auto;
import cc.atu123.learn.patterns.factory.BMWAuto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * User: atu
 * Date: 2017/2/13
 * Time: 17:22
 */
public class Builder {
    private List<Auto> list = new ArrayList<Auto>();
    public void productBMW(int count){
        for (int i=0;i<count;i++){
            list.add(new BMWAuto());
        }
    }

    public void productAodi(int count){
        for (int i=0;i<count;i++){
            list.add(new AodiAuto());
        }
    }
}

package me.pajic.modglue.raised;

import dev.yurisuika.raised.api.RaisedApi;
import dev.yurisuika.raised.util.properties.Element;

public class FarmersDelightCompat {

    public static int runY(int original) {
        return original + (RaisedApi.getY(Element.HOTBAR) * RaisedApi.getPosition(Element.HOTBAR).getY());
    }

    public static int runX(int original) {
        return original + (RaisedApi.getX(Element.HOTBAR) * RaisedApi.getPosition(Element.HOTBAR).getX());
    }
}

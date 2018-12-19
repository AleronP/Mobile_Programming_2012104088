package com.example.aleron.mpmpmpmpmpmp;

import android.graphics.drawable.Drawable;

public class TextItems {
    private String infoText;
    private String whereText;
    private Drawable arrow_button;

    TextItems(String _info, String _where, Drawable _arrow) {
        infoText = _info;
        whereText = _where;
        arrow_button = _arrow;
    }

    public Drawable getArrow_button() {
        return arrow_button;
    }

    public String getInfoText() {
        return infoText;
    }

    public String getWhereText() {
        return whereText;
    }


    public void setArrow_button(Drawable arrow) {
        arrow_button = arrow;
    }

    public void setInfoText(String info) {
        infoText = info;
    }

    public void setWhereText(String where) {
        whereText = where;
    }
}

package com.unidad21.raulsierro.cmunidad21;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

/**
 * Created by raulsierro on 12/1/15.
 */
public class Titular {

    private String image;
    private String titulo;
    private int checkBox;
    public Titular(String img, String tit, int ch) {
        image = img;
        titulo = tit;
        checkBox = ch;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getCheckBox() {
        return checkBox;
    }

    public String getImageView() {
        return image;
    }



}

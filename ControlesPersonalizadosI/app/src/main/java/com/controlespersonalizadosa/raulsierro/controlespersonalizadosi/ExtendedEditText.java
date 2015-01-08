package com.controlespersonalizadosa.raulsierro.controlespersonalizadosi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by raulsierro on 7/1/15.
 */
public class ExtendedEditText extends EditText{

    private Paint p1;
    private Paint p2;
    //private float escala;
    //private int anInt;

    public ExtendedEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Inicializacion();
    }


    public ExtendedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        Inicializacion();
    }

    public ExtendedEditText(Context context) {
        super(context);
        Inicializacion();
    }



    private  void Inicializacion() {
        Paint p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p1.setColor(Color.BLACK);
        p1.setStyle(Paint.Style.FILL);

        Paint p2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p2.setColor(Color.WHITE);
        p2.setTextSize(20);

        //escala = getResources().getDisplayMetrics().density;
    }

    @Override

    public void onDraw(Canvas canvas) {

        // Llamaremos al metodo de la clase base (EditText)
        super.onDraw(canvas);

        // Dibujamos fondo nergro del contador
        canvas.drawRect(this.getWidth()-30, 5,this.getWidth()-5,20, p1);

        // Dibujamos el numero de caracteres en el contador
        canvas.drawText("" + this.getText().toString().length(), this.getWidth()-28, 17, p2);


    }

}

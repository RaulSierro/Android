package com.fragment.raulsierro.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by raulsierro on 12/1/15.
 */
public class DetalleActivity extends FragmentActivity {

    public static final String EXTRA_TEXTO =
            "com.raulsierro.android.fragments.EXTRA_TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        FragmenDetalle detalle =
                (FragmenDetalle)getSupportFragmentManager()
                        .findFragmentById(R.id.FrgDetalle);

        detalle.mostrarDetalle(
                getIntent().getStringExtra(EXTRA_TEXTO));
    }
}

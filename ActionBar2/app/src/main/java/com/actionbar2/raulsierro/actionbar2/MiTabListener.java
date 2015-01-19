package com.actionbar2.raulsierro.actionbar2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.util.Log;

/**
 * Created by Raul on 19/01/2015.
 */
public class MiTabListener implements ActionBar.TabListener {

    private Fragment fragment;

    public MiTabListener(Fragment fg) {
        this.fragment = fg;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        Log.i("ActionBar", tab.getText() + "Reselecionada");

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {


        Log.i("ActionBar", tab.getText() + "Seleccionada.");
        fragmentTransaction.replace(R.id.contenedor, fragment);

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        Log.i("ActionBar", tab.getText() + "Deseleccionada.");
        fragmentTransaction.remove(fragment);

    }
}

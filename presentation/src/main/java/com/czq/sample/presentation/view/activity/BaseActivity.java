/**
 * Copyright (C) 2016 Baidu Inc. All rights reserved.
 */
package com.czq.sample.presentation.view.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;


/**
 * BaseActivity
 *
 * @author chenzhiqin
 * @since 2016/5/23
 */
public class BaseActivity extends AppCompatActivity {


    /**
     * 增加 Fragment
     * @param viewId View id
     * @param fragment Fragment
     */
   protected void addFragment(int viewId, Fragment fragment) {
       FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
       fragmentTransaction.add(viewId,fragment);
       fragmentTransaction.commit();
    }
}

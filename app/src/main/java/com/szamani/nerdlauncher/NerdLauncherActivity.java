package com.szamani.nerdlauncher;

import android.support.v4.app.Fragment;

/**
 * Created by Szamani on 3/21/2016.
 *
 * Key features of this app:
 * * Using of PackageManager to get a list of all possible
 *   apps that can have a MAIN and LAUNCHER activity
 * * Using of a RecyclerView to show that list in a LinearLayout
 * * Add an app as another option for the home button
 *
 */

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }
}

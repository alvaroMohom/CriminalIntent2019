package com.alvaromohom.android.criminalintent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}

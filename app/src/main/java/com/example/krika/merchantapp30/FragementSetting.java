package com.example.krika.merchantapp30;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

public class FragementSetting extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preference_setting);
    }
}

package app.education.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * @author Markin Andrey on 27.09.2017.
 */
public class SettingFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences); // load from XML
    }
}

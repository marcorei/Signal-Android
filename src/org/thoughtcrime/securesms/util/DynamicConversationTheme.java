package org.thoughtcrime.securesms.util;

import android.app.Activity;

import org.thoughtcrime.securesms.R;

public class DynamicConversationTheme extends DynamicTheme {
    @Override
    protected int getSelectedTheme(Activity activity) {
        String theme = TextSecurePreferences.getTheme(activity);

        if (theme.equals(LIGHT)) return R.style.TextSecure_LightThemeConversation;
        return super.getSelectedTheme(activity);
    }
}

package shortbread;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import com.example.AdvancedShortcutActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint({
        "NewApi",
        "ResourceType"
})
public final class ShortbreadGenerated {
    public static List<List<ShortcutInfo>> createShortcuts(Context context) {
        List<ShortcutInfo> enabledShortcuts = new ArrayList<>();
        List<ShortcutInfo> disabledShortcuts = new ArrayList<>();
        enabledShortcuts.add(new ShortcutInfo.Builder(context, "ID_2")
                .setShortLabel("SHORT_LABEL")
                .setLongLabel("LONG_LABEL")
                .setIcon(Icon.createWithResource(context, 123))
                .setDisabledMessage("DISABLED_MESSAGE")
                .setIntents(TaskStackBuilder.create(context)
                        .addParentStack(AdvancedShortcutActivity.class)
                        .addNextIntent(new Intent(context, AdvancedShortcutActivity.class)
                                .setAction("ACTION"))
                        .getIntents())
                .setRank(1)
                .build());
        return Arrays.asList(enabledShortcuts, disabledShortcuts);
    }

    public static void callMethodShortcut(Activity activity) {
    }
}

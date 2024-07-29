package com.sipl.flashmessage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class FlashMessage {

    public static void showPersonalizedFlash(Context context, String message, boolean isShortLength, int backgroundColor, int textColor) {
        int length = isShortLength ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, length);
        View view = toast.getView();
        view.getBackground().setColorFilter(ContextCompat.getColor(context, backgroundColor), PorterDuff.Mode.SRC_IN);

        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(ContextCompat.getColor(context, textColor));
        toast.show();

    }

    public static void showCaramelOverDarkFlash(Context context, String message, boolean isShortLength) {
        int length = isShortLength ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, length);
        View view = toast.getView();
        view.getBackground().setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_IN);

        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.parseColor("#9a6e61"));
        toast.show();
    }

    public static void showCaramelOverLightFlash(Context context, String message, boolean isShortLength) {
        int length = isShortLength ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, length);
        View view = toast.getView();
        view.getBackground().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.parseColor("#9a6e61"));
        toast.show();
    }

    public static void showLightOverCaramelFlash(Context context, String message, boolean isShortLength) {
        int length = isShortLength ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, length);
        View view = toast.getView();
        view.getBackground().setColorFilter(Color.parseColor("#9a6e61"), PorterDuff.Mode.SRC_IN);

        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(Color.parseColor("#ffffff"));
        toast.show();
    }
}

package eu.marcocattaneo.androidinstagramconnector.connection.implementation;

import android.support.annotation.Nullable;

public interface RequestCallback {

    void onResponse(int resultCode, @Nullable String body);

}

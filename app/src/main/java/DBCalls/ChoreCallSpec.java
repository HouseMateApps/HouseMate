package DBCalls;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * Created by Robert Lyons on 5/3/2015.
 */
public class ChoreCallSpec extends ServerCallSpec {

    private static final String LOG_TAG = "ChoreCallSpec";

    @Override
    public void useResult(Context context, String result) {
        if (result == null) {
            // Do something here, e.g. tell the user that the server cannot be contacted.
            Log.i(LOG_TAG, "The server call failed.");
        } else {
            // Translates the string result, decoding the Json.
            Log.i(LOG_TAG, "Received string: " + result);
//            displayResult(result);
        }
    }
}

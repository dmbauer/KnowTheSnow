/**
 * Created by himadri on 27/7/16.
 */

package com.dmbauer.knowthesnow;

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of earthquakes by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class WeatherLoader extends AsyncTaskLoader<List<Weather>> {

    /** Tag for log messages */
    private static final String LOG_TAG = WeatherLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link WeatherLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public WeatherLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Weather> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of weathers.
        List<Weather> weathers = QueryUtils.fetchEarthquakeData(mUrl);
        return weathers;
    }
}
package com.dmbauer.knowthesnow;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;


/**
 * An {@link WeatherAdapter} knows how to create a list item layout for each weather day
 * in the data source (a list of {@link Weather} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class WeatherAdapter extends ArrayAdapter<Weather> {

    /**
     * Constructs a new {@link WeatherAdapter}.
     *
     * @param context     of the app
     * @param weathers is the list of weathers, which is the data source of the adapter
     */
    public WeatherAdapter(Context context, List<Weather> weathers) {
        super(context, 0, weathers);
    }

    /**
     * Returns a list item view that displays information about the weather at the given position
     * in the list of days.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.weather_list_item, parent, false);
        }

        // Find the weather at the given position in the list of weathers
        Weather currentWeather = getItem(position);

        // Get the original location string from the Weather object,
        // which can be in the format of "5km N of Cairo, Egypt" or "Pacific-Antarctic Ridge".
        String location = currentWeather.getLocation();

        // Find the TextView with view ID location
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.weather_text_view);
        // Display the location of the current earthquake in that TextView
        primaryLocationView.setText(location);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}


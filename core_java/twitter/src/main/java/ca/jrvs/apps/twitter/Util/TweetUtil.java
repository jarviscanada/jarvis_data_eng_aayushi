package ca.jrvs.apps.twitter.Util;

import ca.jrvs.apps.twitter.model.Coordinates;
import ca.jrvs.apps.twitter.model.Tweet;

import java.util.ArrayList;
import java.util.List;

public class TweetUtil {

    /**
     * Create a tweet object
     *
     * @param text
     * @param lon
     * @param lat
     * @return tweet
     */
    public static Tweet buildTweet(String text, Double lon, Double lat) {

        Tweet tweet = new Tweet();
        tweet.setText(text);
        Coordinates coordinates = new Coordinates();
        List<Double> list = new ArrayList<>();
        list.add(lon);
        list.add(lat);
        coordinates.setCoordinatesTweet(list);
        tweet.setCoordinates(coordinates);
        return tweet;
    }
}


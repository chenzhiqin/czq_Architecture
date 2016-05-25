package com.czq.sample.presentation.navigation;

/**
 * Navigator
 *
 * @author chenzhiqin
 * @since 2016/5/24
 */
public class Navigator {
    private static Navigator ourInstance = new Navigator();

    public static Navigator getInstance() {
        return ourInstance;
    }

    private Navigator() {
    }
}

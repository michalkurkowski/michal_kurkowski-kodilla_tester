package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;

public class WeatherAlertTestSuite {

    WeatherAlert weatherAlert = new WeatherAlert();
    User user = Mockito.mock(User.class);
    Alert alert = Mockito.mock(Alert.class);

    @Test
    public void userShouldBeAddToLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user1 = Mockito.mock(User.class);
        weatherAlert.addUserToLocalisation(user1, "Warsaw");
        Mockito.verify(user1, Mockito.times(1)).receive(alert);
    }

    @Test
    public void userShouldNotGetAlertFromLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user1 = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.addUserToLocalisation(user1, "Warsaw");
        weatherAlert.unsubscribeAlertFromLocalisation(user1, "Warsaw");
        Mockito.verify(user1, never()).receive(alert);
    }

    @Test
    public void userShouldBeUnsubscribedFromAllLocalisations() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.unsubscribeUserFromAllLocalisations(user);
        weatherAlert.addUserToLocalisation(user, "London");
        weatherAlert.addUserToLocalisation(user, "Warsaw");
        weatherAlert.unsubscribeUserFromAllLocalisations(user);
        Mockito.verify(user, never()).receive(alert);
    }

    @Test
    public void alertsShouldBeSendToAllUsers() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        User user1 = Mockito.mock(User.class);
        weatherAlert.addUserToLocalisation(user, "Warsaw");
        weatherAlert.addUserToLocalisation(user1, "Warsaw");
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.sendAlertsToAllUsers(alert);
        Mockito.verify(user, Mockito.times(1)).receive(alert);
        Mockito.verify(user1, Mockito.times(1)).receive(alert);

    }
}

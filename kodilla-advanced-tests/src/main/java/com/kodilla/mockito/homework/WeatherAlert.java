package com.kodilla.mockito.homework;

import com.kodilla.mockito.homework.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAlert {
    private Map<String, List<User>> users = new HashMap<>();

    public void addUserToLocalisation(User user, String localisation) {
        if (users.containsKey(localisation)) {
            List<User> usersList = new ArrayList<>();
            usersList.add(user);
            users.put(localisation, usersList);
        } else {
            users.get(localisation).add(user);

        }
    }

    public void unsubscribeAlertFromLocalisation(User user, String localisation) {
        if (users.containsKey(localisation)) {
            users.get(localisation).remove(user);
        }
    }

    public void unsubscribeUserFromAllLocalisations(User user) {
        this.users.remove(user);
    }

    List<User> user = new ArrayList<>();
    public void sendAlertsToAllUsers (Alert alert) {
        user.forEach(user -> user.receive(alert));
    }

    public void sendAlerts (Alert alert, String localisation) {
        if (users.containsKey(localisation)) {
            users.get(localisation).forEach(user -> user.receive(alert));
        }
    }
}


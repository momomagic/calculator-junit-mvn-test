package com.example.project;

import com.example.project.http.Connector;

public class ScientificCalculator {
    private final Connector connector;
    private final String url;

    public ScientificCalculator(Connector connector, String url) {
        this.connector = connector;
        this.url = url;
    }

    public int add(int first, int second) {
        if (this.connector.connect(url)) {
            return first + second;
        } else {
            throw new RuntimeException("Connection failed");
        }
    }

    public int subtract(int first, int second) {
        if (this.connector.connect(url)) {
            return first - second;
        } else {
            throw new RuntimeException("Connection failed");
        }
    }

    public int multiply(int first, int second) {
        if (this.connector.connect(url)) {
            return first * second;
        } else {
            throw new RuntimeException("Connection failed");
        }
    }
}

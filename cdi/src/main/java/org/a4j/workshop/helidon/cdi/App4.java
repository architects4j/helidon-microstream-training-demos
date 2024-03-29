package org.a4j.workshop.helidon.cdi;

import org.a4j.workshop.helidon.cdi.news.Journalist;
import org.a4j.workshop.helidon.cdi.news.News;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class App4 {

    public static void main(String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Journalist journalist = container.select(Journalist.class).get();
            journalist.receiveNews(News.of("Java 17 has arrived!!"));
            journalist.specificNews(News.of("That is a exclusive interview of the spec leader of Java 17"));
        }
    }
}

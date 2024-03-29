package org.a4j.workshop.helidon.cdi.news;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class Journalist {

    @Inject
    private Event<News> event;

    @Inject
    @Specific
    private Event<News> specificEvent;

    public void receiveNews(News news) {
        this.event.fire(news);
    }

    public void specificNews(News news) {
        this.specificEvent.fire(news);
    }
}

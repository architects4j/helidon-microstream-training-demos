package org.a4j.workshop.helidon.cdi.news;

import java.util.Objects;
import java.util.function.Supplier;

public final class News implements Supplier<String> {

    private final String name;

    private News(String name) {
        this.name = name;
    }

    @Override
    public String get() {
        return name;
    }

    public static News of(String news) {
        Objects.requireNonNull(news, "news is required");
        return new News(news);
    }
}

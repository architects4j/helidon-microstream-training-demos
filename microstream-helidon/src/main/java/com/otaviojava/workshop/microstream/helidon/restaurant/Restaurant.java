package com.otaviojava.workshop.microstream.helidon.restaurant;

import one.microstream.integrations.cdi.types.Storage;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

@ApplicationScoped
@Storage
public class Restaurant {

    private final Set<Item> items = new HashSet<>();
    public Collection<Item> getAll() {
        return Collections.unmodifiableSet(this.items);
    }

    Item save(Item item){
        Objects.requireNonNull(item, "item is required");
        this.items.add(item);
        return item;
    }

    Optional<Item> findById(String id){
        return this.items.stream().filter(this.isIdEquals(id)).limit(1).findFirst();
    }

    void deleteById(String id){
        this.items.removeIf(this.isIdEquals(id));
    }

    private Predicate<Item> isIdEquals(final String id) {
        return p -> p.getName() == id;
    }
}

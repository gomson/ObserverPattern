package com.guigarage.observer;

import java.util.Optional;

/**
 * TODO
 * @author Hendrik Ebbers
 */
public interface Observable<V> {

    default V get() {
        return value().orElse(null);
    }

    Optional<V> value();

    Subscription onChanged(ValueChangeListener<? super V> listener);
}
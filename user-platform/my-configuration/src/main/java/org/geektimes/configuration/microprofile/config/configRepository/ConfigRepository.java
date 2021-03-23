package org.geektimes.configuration.microprofile.config.configRepository;

public interface ConfigRepository {
    <T> T get(String key, ClassLoader cl, Class<T> c);
}

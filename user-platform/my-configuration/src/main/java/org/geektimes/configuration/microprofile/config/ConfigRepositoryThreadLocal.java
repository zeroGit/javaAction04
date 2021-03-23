package org.geektimes.configuration.microprofile.config;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.spi.ConfigProviderResolver;
import org.geektimes.configuration.microprofile.config.configRepository.ConfigRepository;

public class ConfigRepositoryThreadLocal {

    private static ConfigProviderResolver resolver;

    private static final ThreadLocal<Config> threadLocal = new ThreadLocal<Config>() {
        @Override
        protected Config initialValue() {
            return resolver.getConfig(this.getClass().getClassLoader());
        }
    };

    public static void setResolver(ConfigProviderResolver resolver) {
        ConfigRepositoryThreadLocal.resolver = resolver;
    }

    public static <T> T get(String key, Class<T> c) {
        return threadLocal.get().getValue(key, c);
    }
}

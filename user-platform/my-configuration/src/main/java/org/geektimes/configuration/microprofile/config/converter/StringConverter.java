package org.geektimes.configuration.microprofile.config.converter;

import org.eclipse.microprofile.config.spi.Converter;

public class StringConverter extends AbstractConverter<String> {

    @Override
    protected String doConvert(String value) {
        return value;
    }
}

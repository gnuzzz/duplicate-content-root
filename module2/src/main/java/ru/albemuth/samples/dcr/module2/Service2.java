package ru.albemuth.samples.dcr.module2;

import ru.albemuth.samples.dcr.api.Data;

/**
 * @author Vladimir Kornyshev {@literal <vkornyshev@at-consulting.ru>}
 */
public class Service2 {

    public Data getData(String value) {
        return new Data(value);
    }

}

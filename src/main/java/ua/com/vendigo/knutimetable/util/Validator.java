package ua.com.vendigo.knutimetable.util;

import java.util.Collection;

public class Validator {
    public static  <T> T notNull(T t, String tName) {
        if (t==null) {
            throw new IllegalArgumentException(tName+" must be not null");
        }
        return t;
    }

    public static  int isPositive(int i, String iName) {
        if (i<=0) {
            throw new IllegalArgumentException(iName+" must be not positive");
        }
        return i;
    }

    public static  String notEmpty(String s, String sName) {
        notNull(s, sName);

        if (s.isEmpty()) {
            throw new IllegalArgumentException(sName+" must be not empty");
        }
        return s;
    }

    public static  <T> Collection<T> notEmpty(Collection<T> collection, String collectionName) {
        notNull(collection, collectionName);

        if (collection.isEmpty()) {
            throw new IllegalArgumentException(collectionName+" must be not empty");
        }
        return collection;
    }
}

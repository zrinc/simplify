package org.cf.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestImmutableUtils {

    @Test
    public void testStringsImmutable() {
        assertTrue(ImmutableUtils.isImmutableClass("Ljava/lang/String;"));
    }

}

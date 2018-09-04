package com.github.nettee.fog;

import org.jline.reader.impl.history.DefaultHistory;

import java.time.Instant;

public final class FogHistory extends DefaultHistory {

    private static boolean isComment(String line) {
        return line.startsWith("#");
    }

    @Override
    public void add(Instant time, String line) {
        if (isComment(line)) {
            return;
        }
        super.add(time, line);
    }
}

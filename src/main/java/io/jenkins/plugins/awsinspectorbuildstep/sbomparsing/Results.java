package io.jenkins.plugins.awsinspectorbuildstep.sbomparsing;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

import static io.jenkins.plugins.awsinspectorbuildstep.sbomparsing.Severity.CRITICAL;
import static io.jenkins.plugins.awsinspectorbuildstep.sbomparsing.Severity.HIGH;
import static io.jenkins.plugins.awsinspectorbuildstep.sbomparsing.Severity.LOW;
import static io.jenkins.plugins.awsinspectorbuildstep.sbomparsing.Severity.MEDIUM;

public class Results {

    @Getter
    private Map<Severity, Integer> counts = new HashMap<>();

    public Results() {
        counts.put(CRITICAL, 0);
        counts.put(HIGH, 0);
        counts.put(MEDIUM, 0);
        counts.put(LOW, 0);
    }

    public void increment(Severity severityToIncrement) {
        counts.put(severityToIncrement, counts.get(severityToIncrement) + 1);
    }
}

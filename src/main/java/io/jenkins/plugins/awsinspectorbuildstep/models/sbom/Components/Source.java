package io.jenkins.plugins.awsinspectorbuildstep.models.sbom.Components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Source {
    private String name;
    private String url;
}

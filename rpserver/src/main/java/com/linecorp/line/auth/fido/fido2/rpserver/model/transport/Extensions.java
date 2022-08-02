package com.linecorp.line.auth.fido.fido2.rpserver.model.transport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Extensions {
    @JsonProperty("example.extension.bool")
    private boolean boolData;
}

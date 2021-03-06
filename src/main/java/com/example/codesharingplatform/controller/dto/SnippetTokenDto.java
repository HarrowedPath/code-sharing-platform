package com.example.codesharingplatform.controller.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SnippetTokenDto {
    @JsonProperty("id")
    String token;
}

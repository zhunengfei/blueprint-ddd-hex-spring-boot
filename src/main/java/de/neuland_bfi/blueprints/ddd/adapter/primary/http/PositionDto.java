package de.neuland_bfi.blueprints.ddd.adapter.primary.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PositionDto {

    private String artikelId;
    private String anzahl;
}

package de.neuland_bfi.blueprints.ddd.adapter.primary.http;

import lombok.Data;

@Data
public class PositionHinzufügenDto {

    private String artikelId;
    private String anzahl;

}

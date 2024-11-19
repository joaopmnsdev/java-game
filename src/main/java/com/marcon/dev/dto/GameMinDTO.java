package com.marcon.dev.dto;

import com.marcon.dev.projection.GameMinProjection;
import com.marcon.dev.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.shortDescription = entity.getShortDescription();
        this.imgUrl = entity.getImgUrl();
        this.year = entity.getYear();
    }

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.shortDescription = projection.getShortDescription();
        this.imgUrl = projection.getImgUrl();
        this.year = projection.getGameYear();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Integer getYear() {
        return year;
    }
}

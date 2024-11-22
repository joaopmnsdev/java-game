package com.marcon.dev.dto;

public class replacementDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;

    public replacementDTO(){

    }

    public replacementDTO(Integer sourceIndex, Integer destinationIndex) {
        this.sourceIndex = sourceIndex;
        this.destinationIndex = destinationIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }
}


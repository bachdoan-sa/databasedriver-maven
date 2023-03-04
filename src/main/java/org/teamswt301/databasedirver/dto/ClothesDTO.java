/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.databasedirver.dto;

/**
 *
 * @author AN515-57
 */
public class ClothesDTO {
    private int clothesID;
    private String clothesName;
    private String characterID;
    private short size;
    private String description;
    private String clothesNote;

    public int getClothesID() {
        return clothesID;
    }

    public void setClothesID(int clothesID) {
        this.clothesID = clothesID;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public String getCharacterID() {
        return characterID;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public short getSize() {
        return size;
    }

    public void setSize(short size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClothesNote() {
        return clothesNote;
    }

    public void setClothesNote(String clothesNote) {
        this.clothesNote = clothesNote;
    }

    public ClothesDTO() {
    }

    public ClothesDTO(int clothesID, String clothesName, String characterID, short size, String description, String clothesNote) {
        this.clothesID = clothesID;
        this.clothesName = clothesName;
        this.characterID = characterID;
        this.size = size;
        this.description = description;
        this.clothesNote = clothesNote;
    }

    @Override
    public String toString() {
        return "ClothesDTO{" + "clothesID=" + clothesID + ", clothesName=" + clothesName + ", characterID=" + characterID + ", size=" + size + ", description=" + description + ", clothesNote=" + clothesNote + '}';
    }
    
}

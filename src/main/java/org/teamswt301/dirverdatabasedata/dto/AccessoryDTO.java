/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dto;

/**
 *
 * @author AN515-57
 */
public class AccessoryDTO {
    private int accessoryID;
    private String accessoryName;
    private String characterID;
    private String type;
    private String description;
    private String accessoryNote;

    public int getAccessoryID() {
        return accessoryID;
    }

    public void setAccessoryID(int accessoryID) {
        this.accessoryID = accessoryID;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public String getCharacterID() {
        return characterID;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccessoryNote() {
        return accessoryNote;
    }

    public void setAccessoryNote(String accessoryNote) {
        this.accessoryNote = accessoryNote;
    }
    
    public AccessoryDTO() {
    }

    public AccessoryDTO(int accessoryID, String accessoryName, String characterID, String type, String description, String accessoryNote) {
        this.accessoryID = accessoryID;
        this.accessoryName = accessoryName;
        this.characterID = characterID;
        this.type = type;
        this.description = description;
        this.accessoryNote = accessoryNote;
    }
    
}

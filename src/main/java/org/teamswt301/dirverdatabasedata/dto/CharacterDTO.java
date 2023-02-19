/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dto;

/**
 *
 * @author AN515-57
 */
public class CharacterDTO {
    private String characterID;
    private String characterName;
    private String description;

    public String getCharacterID() {
        return characterID;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CharacterDTO() {
    }
    
    public CharacterDTO(String characterID, String characterName, String description) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.description = description;
    }
    
}

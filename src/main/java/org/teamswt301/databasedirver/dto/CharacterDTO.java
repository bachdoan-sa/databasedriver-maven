/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.databasedirver.dto;

/**
 *
 * @author AN515-57
 */
public class CharacterDTO {
    private int characterID;
    private String characterName;
    private String description;

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
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
    
    public CharacterDTO(int characterID, String characterName, String description) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "CharacterDTO{" + "characterID=" + characterID + ", characterName=" + characterName + ", description=" + description + '}';
    }
    
}

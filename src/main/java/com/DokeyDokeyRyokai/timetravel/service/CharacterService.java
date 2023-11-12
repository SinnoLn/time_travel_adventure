package com.DokeyDokeyRyokai.timetravel.service;

import com.DokeyDokeyRyokai.timetravel.model.Character;
import java.util.List;

public interface CharacterService {
    List<Character> getAllCharacters();
    Character getCharacterById(Long id);
    Character createCharacter(Character character);
    Character updateCharacter(Long id, Character characterDetails);
    void deleteCharacter(Long id);
}

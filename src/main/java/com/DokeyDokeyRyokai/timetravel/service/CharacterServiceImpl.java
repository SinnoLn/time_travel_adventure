package com.DokeyDokeyRyokai.timetravel.service;

import com.DokeyDokeyRyokai.timetravel.model.Character;
import com.DokeyDokeyRyokai.timetravel.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @Override
    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    @Override
    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character updateCharacter(Long id, Character characterDetails) {
        Character character = characterRepository.findById(id).orElse(null);
        if (character != null) {
            character.setId(characterDetails.getId());
            character.setName(characterDetails.getName());
            character.setDescription(characterDetails.getDescription());
            character.setRole(characterDetails.getRole());
            // ... 기타 필드 업데이트
            return characterRepository.save(character);
        }
        return null;
    }

    @Override
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}

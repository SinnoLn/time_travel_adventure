package com.DokeyDokeyRyokai.timetravel.controller;

import com.DokeyDokeyRyokai.timetravel.model.Character;
import com.DokeyDokeyRyokai.timetravel.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    // 모든 캐릭터 조회
    @GetMapping
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    // 특정 ID의 캐릭터 조회
    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    // 새 캐릭터 생성
    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterRepository.save(character);
    }

    // 캐릭터 업데이트
    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody Character characterDetails) {
        Character character = characterRepository.findById(id).orElse(null);
        if (character != null) {
            character.setName(characterDetails.getName());
            character.setRole(characterDetails.getRole());
            // ... 기타 필드 업데이트
            characterRepository.save(character);
        }
        return character;
    }

    // 캐릭터 삭제
    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterRepository.deleteById(id);
    }
}

package com.DokeyDokeyRyokai.timetravel.controller;

import com.DokeyDokeyRyokai.timetravel.model.Story;
import com.DokeyDokeyRyokai.timetravel.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stories")
public class StoryController {
    @Autowired
    private StoryRepository storyRepository;

    // GET: 모든 스토리 조회
    @GetMapping
    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }

    // GET: 특정 ID의 스토리 조회
    @GetMapping("/{id}")
    public Story getStoryById(@PathVariable Long id) {
        return storyRepository.findById(id).orElse(null);
    }

    // POST: 새 스토리 생성
    @PostMapping
    public Story createStory(@RequestBody Story story) {
        return storyRepository.save(story);
    }

    // PUT: 스토리 업데이트
    @PutMapping("/{id}")
    public Story updateStory(@PathVariable Long id, @RequestBody Story storyDetails) {
        Story story = storyRepository.findById(id).orElse(null);
        if (story != null) {
            story.setTitle(storyDetails.getTitle());
            story.setDescription(storyDetails.getDescription());
            // ... 기타 필드 업데이트
            storyRepository.save(story);
        }
        return story;
    }

    // DELETE: 스토리 삭제
    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable Long id) {
        storyRepository.deleteById(id);
    }
}

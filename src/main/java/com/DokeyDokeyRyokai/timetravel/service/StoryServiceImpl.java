package com.DokeyDokeyRyokai.timetravel.service;

import com.DokeyDokeyRyokai.timetravel.model.Story;
import com.DokeyDokeyRyokai.timetravel.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StoryServiceImpl implements StoryService {

    @Autowired
    private StoryRepository storyRepository;

    @Override
    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }

    @Override
    public Story getStoryById(Long id) {
        return storyRepository.findById(id).orElse(null);
    }

    @Override
    public Story createStory(Story story) {
        return storyRepository.save(story);
    }

    @Override
    public Story updateStory(Long id, Story storyDetails) {
        Story story = storyRepository.findById(id).orElse(null);
        if (story != null) {
            story.setId(storyDetails.getId());
            story.setTitle(storyDetails.getTitle());
            story.setDescription(storyDetails.getDescription());
            // ... 기타 필드 업데이트
            return storyRepository.save(story);
        }
        return null;
    }

    @Override
    public void deleteStory(Long id) {
        storyRepository.deleteById(id);
    }
}

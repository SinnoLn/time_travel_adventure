package com.DokeyDokeyRyokai.timetravel.service;

import com.DokeyDokeyRyokai.timetravel.model.Story;
import java.util.List;

public interface StoryService {
    List<Story> getAllStories();
    Story getStoryById(Long id);
    Story createStory(Story story);
    Story updateStory(Long id, Story storyDetails);
    void deleteStory(Long id);
}

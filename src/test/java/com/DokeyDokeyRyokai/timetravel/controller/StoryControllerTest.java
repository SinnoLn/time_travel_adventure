package com.DokeyDokeyRyokai.timetravel.controller;

import com.DokeyDokeyRyokai.timetravel.model.Story;
import com.DokeyDokeyRyokai.timetravel.service.StoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(MockitoExtension.class)
class StoryControllerTest {
    private MockMvc mockMvc;

    @Mock
    private StoryService storyService;

    @InjectMocks
    private StoryController storyController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(storyController).build();
    }

    @Test
    void getAllStories() {
    }

    @Test
    void getStoryById() {
    }

    @Test
    void createStory() {
    }

    @Test
    void updateStory() {
    }

    @Test
    void deleteStory() {
    }
}
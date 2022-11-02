package com.demo.unittesting.controller;

import com.demo.unittesting.domain.Person;
import com.demo.unittesting.service.IPersonService;
import com.demo.unittesting.util.JsonUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(value = PersonController.class)
public class PersonControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private IPersonService service;

    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    public void whenPostPerson_thenCreatePerson() throws Exception {
        Person adan = new Person("adan","alvarez");
        given(service.save(Mockito.any())).willReturn(adan);

        mvc.perform(post("/person").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(adan))).andExpect(status().isCreated()).andExpect(jsonPath("$.name", is("adan")));
        verify(service, VerificationModeFactory.times(1)).save(Mockito.any());
        reset(service);
    }

}

package com.framework.demo.web.controller.showcase.deleted;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

/**
 * @author hassop
 * @Description
 * @date 2016/9/1 0001
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = {"classpath*:conf/applicationContext.xml", "classpath*:conf/applicationContext-springmvc.xml"})
public class DeletedSampleControllerTest extends TestCase {

    @Autowired
    private WebApplicationContext wac;

    MockMvc mockMvc;
    @Autowired
    DeletedSampleController deletedSampleController;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.<StandaloneMockMvcBuilder>webAppContextSetup(wac).build();
    }

    @Test
    public void testValidate() throws Exception {
       /* ResultActions resultActions =
                this.mockMvc.perform(MockMvcRequestBuilders.get("showcase/deleted/2/update?BackURL=http%3A%2F%2Flocalhost%3A9090%2Fshowcase%2Fdeleted"));*/
        ResultActions resultActions =
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/showcase/deleted/2/update"));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("=====客户端获得反馈数据:" + result);

    }
}
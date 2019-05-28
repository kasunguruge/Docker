//package lk.group1.auth.server;
//
//
//import lk.group1.auth.server.controller.UserController;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//public class controllerTest {
//
//    private MockMvc mockMvc;
//
//    @InjectMocks
//    private UserController userController;
//
//
//    @Before
//    public void setUp() throws Exception {
//        mockMvc= MockMvcBuilders.standaloneSetup(userController)
//                .build();
//    }
//
////
////    @Test
////    public void createUser() throws Exception{
////        mockMvc.perform(MockMvcRequestBuilders.post("/user")
////
////        ).andExpect(MockMvcResultMatchers.status().isOk());
////    }
////
////    @Test
////    public void updateUser() throws Exception{
////        mockMvc.perform(MockMvcRequestBuilders.put("/updateUser/1")
////
////        ).andExpect(MockMvcResultMatchers.status().isOk());
////    }
////
////    @Test
////    public void deleteUser() throws Exception{
////        mockMvc.perform(MockMvcRequestBuilders.delete("/deleteUser/1")
////
////        ).andExpect(MockMvcResultMatchers.status().isOk());
////    }
//
//
//}

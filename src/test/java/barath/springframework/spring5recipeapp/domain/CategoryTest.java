package barath.springframework.spring5recipeapp.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryTest {
    Category category;

    @Before("")
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception{
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals( idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception{
    }

    @Test
    public void getRecipes() throws Exception{
    }
}
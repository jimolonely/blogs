package com.jimo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * jackson annotation test
 *
 * @author jimo
 * @version 1.0.0
 * @date 2020/9/6 16:51
 */
public class JacksonAnnotationTest {

    @Test
    public void testBean01() throws JsonProcessingException {
        final Bean01 bean01 = new Bean01("jimo", new HashMap<>());
        bean01.getProperties().put("k1", "v1");
        bean01.getProperties().put("k2", "v2");

        final String result1 = new ObjectMapper().writeValueAsString(bean01);
        System.out.println(result1);
        assertThat(result1, containsString("k1"));
        assertThat(result1, containsString("v1"));
    }

    @Test
    public void testBean02() throws JsonProcessingException {
        final Bean02 b = new Bean02(1, "jimo");

        final String result = new ObjectMapper().writeValueAsString(b);
        System.out.println(result);
        assertThat(result, containsString("jimo"));
        assertThat(result, containsString("name"));
        assertThat(result, containsString("1"));
    }

}

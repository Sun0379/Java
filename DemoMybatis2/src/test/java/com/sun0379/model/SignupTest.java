package com.sun0379.model;
import com.sun0379.entity.Signup;

import com.sun0379.mapper.SignupMapper;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SignupTest extends BaseSignupTest {
    @Test
    public void testSelect() {
        SqlSession sessionSelect = getSqlSession();
        SignupMapper mapper = sessionSelect.getMapper(SignupMapper.class);
        //List<Signup> signupList=mapper.SelectByNumber1(1361);
        Signup signupList = mapper.SelectByNumber1(1361);
        System.out.println(signupList);
        sessionSelect.close();
        //Assert.assertEquals("陆大有",signupList);
        System.out.printf("%4s\t%4s\t%-4d\t%4s\t%4s\t%4s\n", signupList.getAttribute(), signupList.getName(),
                signupList.getQQ(), signupList.getSchool(), signupList.getDream(), signupList.getTeacher());
        //Assert.assertEquals("陆有",signupList.getName());
    }

    @Test
    public void testDetele() {
        SqlSession sessionSelect = getSqlSession();
        SignupMapper mapper = sessionSelect.getMapper(SignupMapper.class);
        //List<Signup> signupList=mapper.SelectByNumber1(1361);
        int signupList = mapper.DeleteByNumber1(1361);
        System.out.println(signupList);
        sessionSelect.commit();
        sessionSelect.close();
        //Assert.assertEquals("陆大有",signupList);
    }
    @Test
    public  void testUpdate(){
        SqlSession sessionSelect = getSqlSession();
        SignupMapper mapper = sessionSelect.getMapper(SignupMapper.class);
       // signup.setNumber1(1360);
        int signupList = mapper.updateByNumber1("测试","老大走起","赵龙",1360);
        System.out.println(signupList);
        sessionSelect.commit();
        sessionSelect.close();
        //Assert.assertEquals("陆大有",signupList);
    }
    @Test
    public  void testInsert(){
        SqlSession sessionSelect = getSqlSession();
        SignupMapper mapper = sessionSelect.getMapper(SignupMapper.class);
        // signup.setNumber1(1360);
        int signupList = mapper.InsertByNumber1(165,"测试","张龙",666,20180909,"南大","http://www.jnshu.com/school/28015/daily","QQ空间",1631,"老大走起","赵龙");
        System.out.println(signupList);
        sessionSelect.commit();
        sessionSelect.close();
        //Assert.assertEquals("陆大有",signupList);
    }
}
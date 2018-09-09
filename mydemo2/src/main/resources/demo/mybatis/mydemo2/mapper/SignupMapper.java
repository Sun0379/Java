package demo.mybatis.mydemo2.mapper;
import demo.mybatis.mydemo2.model.Signup;

import java.util.Map;

public interface SignupMapper{
	    //这些方法和mapper.xml中的select id/update id保持一致
		List<String> selectAll();
		Signup selectByNumber1(Integer Number1);
        //List<String> updateByNumber1(String Attribute,String Dream,String Teacher,Integer Number1);
        Signup updateByNumber1(String Attribute,String Dream,String Teacher,Integer Number1);
		Signup insertByNumber1(Integer Id,String Attribute,String Name,Integer QQ,Integer In_Time,String School,Integer Number1,String Web,String Dream,String Teacher,String Known);
		Signup deleteByNumber1(Integer Number1);
}
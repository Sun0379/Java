package com.sun0379.mapper;

import com.sun0379.entity.Signup;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SignupMapper {
    @Delete("delete from study where Number1=#{Nummber1}")
    public int DeleteByNumber1(Integer Number1);
    @Select("select Attribute,Name,QQ,School,Dream,Teacher from study where Number1=#{Number1}")
    public Signup SelectByNumber1(Integer Number1);
    //Signup updateByNumber1(String Attribute,String Dream,String Teacher,Integer Number1);
    @Update("update study set Attribute=#{Attribute},Dream=#{Dream},Teacher=#{Teacher}  where Number1=#{Number1}")
    //public int UpdateByNumber1(String Attribute,String Dream,String Teacher,Integer Number1);
    public int updateByNumber1(@Param("Attribute") String Attribute, @Param("Dream") String Dream,@Param("Teacher") String Teacher,@Param("Number1") Integer Number1);
    @Insert("insert study set ID=#{ID},Attribute=#{Attribute},Name=#{Name},QQ=#{QQ},In_Time=#{In_Time},School=#{School},Number1=#{Number1},Web=#{Web},Dream=#{Dream},Teacher=#{Teacher},Known=#{Known}")
    public int InsertByNumber1(@Param("ID") Integer ID,@Param("Attribute") String Attribute,@Param("Name") String Name,@Param("QQ") Integer QQ,@Param("In_Time") Integer In_Time, @Param("School") String School,@Param("Web") String Web,@Param("Known") String Known,@Param("Number1") Integer Number1,@Param("Dream") String Dream,@Param("Teacher") String Teacher);
}

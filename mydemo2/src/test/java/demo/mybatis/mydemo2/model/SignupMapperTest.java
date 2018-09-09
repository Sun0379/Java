package demo.mybatis.mydemo2.model;


//import demo.mybatis.mydemo2.mapper.SignupMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;
import java.util.Map;

public class SignupMapperTest extends BaseMapperTest {
    /*
	@Test
	public void testSelectAll() {

		SqlSession sqlSession = getSqlSession();
		try {
			List<Signup> list = sqlSession.selectList("demo.mybatis.mydemo2.mapper.SignupMapper.selectAll");
			//list.set(1,Number1);
			printSignupList(list);
		} finally {
			sqlSession.close();
		}
	}
	*/
    @Test
    public void testSelectByNumber1() {

        SqlSession sqlSessionSelect = getSqlSession();
        try {
            // 执行sql语句，返回list，给下面遍历输出
            List<Signup> list = sqlSessionSelect.selectList("demo.mybatis.mydemo2.mapper.SignupMapper.selectByNumber1", 1361);
            //list.set(1,Number1);
            printSignupList(list);
        } finally {
            sqlSessionSelect.close();
        }
    }


    private void printSignupList(List<Signup> list) {
        // 这里Signup作为list传递过来，然后遍历输出
        for (Signup signup : list) {
            System.out.printf("%4s\t%4s\t%-4d\t%4s\t%4s\t%4s\n", signup.getAttribute(), signup.getName(),
                    signup.getQQ(), signup.getSchool(), signup.getDream(), signup.getTeacher());

        }
    }

    @Test
    public void testUpdateByNumber1() {
        //Map prramMap=new hashMap();
        SqlSession sqlSessionUpdate = getSqlSession();
        try {
            // 执行sql语句，返回list，给下面遍历输出用
            Signup signup = new Signup();
            signup.setAttribute("测试");
            signup.setTeacher("李刚");
            signup.setDream("老大帅");
            signup.setNumber1(1359);
            //int resultUpdate=sqlSession.update("signup");
            List<Signup> list = sqlSessionUpdate.selectList("demo.mybatis.mydemo2.mapper.SignupMapper.updateByNumber1", signup);
            //list.set(1,Number1);
            printSignupList(list);
            //System.out.println(resultUpdate);
            sqlSessionUpdate.commit();
        } finally {
            sqlSessionUpdate.close();
        }
    }

    @Test
    public void testInsertByNumber1() {

        SqlSession sqlSession = getSqlSession();
        try {
            SqlSession sqlSessionInsert = getSqlSession();
                // 执行sql语句，返回list，给下面遍历输出用
                //SignupMapper signupMapper = sqlSession.getMapper(SignupMapper.class);
                //Signup signup = signupMapper.updateByNumber1("测试","老帅了","李想",1359);
                // Signup signupMapper=sqlSession.getMapper(SignupMapper.class);
                //Signup resultUpdate = sqlSession.updateByNumber1("测试", "老帅了", "李想", 1359);
                Signup signup = new Signup();
                signup.setId(29);
                signup.setAttribute("测试");
                signup.setName("池子");
                signup.setQQ(2233);
                signup.setIn_Time(20180909);
                signup.setSchool("成都师范");
                signup.setNumber1(1362);
                signup.setWeb("http://www.jnshu.com/school/28015/daily");
                signup.setTeacher("李诞");
                signup.setDream("老大帅");
                signup.setKnown("QQ空间");
                //int resultUpdate=sqlSession.update("signup");
                List<Signup> list = sqlSessionInsert.selectList("demo.mybatis.mydemo2.mapper.SignupMapper.insertByNumber1", signup);
                //list.set(1,Number1);
                printSignupList(list);
                //System.out.println(resultUpdate);
                sqlSessionInsert.commit();
                sqlSessionInsert.close();
        } finally {
            //sqlSession.close();
        }
    }

    @Test
    public void testDeleteByNumber1() {

        SqlSession sqlSessionDelete = getSqlSession();
        try {
            // 执行sql语句，返回list，给下面遍历输出用
            //SignupMapper signupMapper = sqlSession.getMapper(SignupMapper.class);
            //Signup signup = signupMapper.updateByNumber1("测试","老帅了","李想",1359);
            // Signup signupMapper=sqlSession.getMapper(SignupMapper.class);
            //Signup resultUpdate = sqlSession.updateByNumber1("测试", "老帅了", "李想", 1359);
            //Signup signup = new Signup();
            //signup.setNumber1(1380);
            //int resultUpdate=sqlSession.update("signup");
            List<Signup> list = sqlSessionDelete.selectList("demo.mybatis.mydemo2.mapper.SignupMapper.deleteByNumber1", 1380);
            //list.set(1,Number1);
            printSignupList(list);
            //System.out.println(resultUpdate);
            sqlSessionDelete.commit();
            sqlSessionDelete.close();
        } finally {
            //sqlSession.close();
        }
    }
}


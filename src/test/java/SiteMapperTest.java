import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：MyBatis_foreach
 * Package(包名): PACKAGE_NAME
 * Class(测试类名): SiteMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/14
 * Time(创建时间)： 17:09
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */


class SiteMapperTest
{

    /**
     * Select website.
     *
     * @throws IOException the io exception
     */
    @Test
    void selectWebsite() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);

        List<Site> sites = siteMapper.selectWebsite(list);

        for (Site site : sites)
        {
            System.out.println(site);
            System.out.println();
        }

        sqlSession.close();
    }
}
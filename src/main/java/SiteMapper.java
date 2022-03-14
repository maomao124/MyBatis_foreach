import java.util.List;

/**
 * Project name(项目名称)：MyBatis_foreach
 * Package(包名): PACKAGE_NAME
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/14
 * Time(创建时间)： 17:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface SiteMapper
{
    /**
     * Select website list.
     *
     * @param ageList the age list
     * @return the list
     */
    public List<Site> selectWebsite(List<Integer> ageList);
}

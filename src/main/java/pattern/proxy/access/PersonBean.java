package pattern.proxy.access;

/**
 * 用户信息接口
 *
 * @author NNroc
 * @date 2020/8/18 15:46
 */
public interface PersonBean {
    //名称
    String getName();

    //性别
    String getGender();

    //爱好
    String getInterests();

    //平均评分
    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
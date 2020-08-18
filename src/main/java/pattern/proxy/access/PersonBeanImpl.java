package pattern.proxy.access;

/**
 * @author NNroc
 * @date 2020/8/18 15:47
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    //总评分
    int rating;
    //被评价次数
    int ratingCount = 0;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getInterests() {
        return interests;
    }

    //获得平均评分
    public int getHotOrNotRating() {
        if (ratingCount == 0) return 0;
        return (rating / ratingCount);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    //更新总评分和被评价次数
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
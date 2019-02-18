package mode1.iterator1.book;


/**
 * 1.表示集合的接口
 * Created by Administrator on 2019/2/18
 */
public interface Aggregate {
    /**
     * 生成一个用于遍历集合的迭代器
     */
    public abstract Iterator iterator();
}

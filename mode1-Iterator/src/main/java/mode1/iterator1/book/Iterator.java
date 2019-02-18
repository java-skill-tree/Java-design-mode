package mode1.iterator1.book;

/**
 * 2.遍历集合的接口
 * Created by Administrator on 2019/2/18
 */
public interface Iterator {
    /**
     * 判断是否存在下一个元素
     * 主要用于循环终止条件
     *
     * @return boolean 当集合存在下一个元素 返回true 当集合不存在下一个元素，即已经遍历至集合结尾，返回false
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return Object 返回的是集合中的一个元素
     */
    public abstract Object next();
}

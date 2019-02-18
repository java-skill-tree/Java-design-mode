package mode1.iterator1.book;

/**
 * 5. 遍历书架的类
 * Created by Administrator on 2019/2/18
 */
public class BookShelfIterator implements Iterator {
    // bookShelf表示BookShelfIterator所要遍历的书架
    private BookShelf bookShelf;
    // 表示迭代器当前所指向的书的下标
    private int index;

    // 构造函数将接收到的BookShelf的实例保存在bookShelf字段中，并将index初始化为0
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 判断书架中还有没有下一本书
     *
     * @return
     */
    public boolean hasNext() {
        // 比较index 和 书架中书的总册数
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 返回迭代器当前所指向的书，并让迭代器指向下一本书
     *
     * @return
     */
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}

package org.ds.nocoding;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * 所有的组件必须实现该接口,组件已链表形式存储
 */
public interface Component {

    /**
     * 组件是否是单例
     * @return
     */
    boolean singleton();

    Set<Property> properties();

    Component getNext();

    void setNext(Component next);

    void putPoint(Point point);

    Map<String,Point> getPoints();

    Point getPoint(String name);
}

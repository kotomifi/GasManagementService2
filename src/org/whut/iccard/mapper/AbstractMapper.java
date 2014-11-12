package org.whut.iccard.mapper;

import java.util.List;
import java.util.Map;

public interface AbstractMapper<T> {
    /**
     * �������
     *
     * @param t
     */
    void add(T t);

    /**
     * ���¶���
     *
     * @param t
     * @return
     */
    int update(T t);

    /**
     * ɾ������
     *
     * @param t
     * @return
     */
    int delete(T t);

    /**
     * ����id���Ҷ���
     *
     * @param t
     * @return
     */
    T get(T t);

    /**
     * ����������ҳ��ѯ
     *
     * @param conditions
     * @return
     */
    List<T> find(Map<String, Object> conditions);

}

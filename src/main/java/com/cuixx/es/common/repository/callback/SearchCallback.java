package com.cuixx.es.common.repository.callback;

import com.cuixx.es.common.entity.search.Searchable;

import javax.persistence.Query;

public interface SearchCallback {

    SearchCallback NONE = new NoneSearchCallback();
    SearchCallback DEFAULT = new DefaultSearchCallback();


    /**
     * 动态拼HQL where、group by having
     *
     * @param ql
     * @param search
     */
    public void prepareQL(StringBuilder ql, Searchable search);

    public void prepareOrder(StringBuilder ql, Searchable search);

    /**
     * 根据search给query赋值及设置分页信息
     *
     * @param query
     * @param search
     */
    void setValues(Query query, Searchable search);

    void setPageable(Query query, Searchable search);

}

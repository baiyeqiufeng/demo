package com.qiufeng.demoservice.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;

public interface CUDRDao<T> extends Mapper<T>, BaseSelectMapper<T> {
}
